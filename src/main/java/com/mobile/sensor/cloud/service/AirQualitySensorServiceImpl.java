package com.mobile.sensor.cloud.service;

import com.mobile.sensor.cloud.airquality.AirQualitySensorGrpc;
import com.mobile.sensor.cloud.airquality.AirSensorData;
import com.mobile.sensor.cloud.airquality.AirSensorDetails;
import com.mobile.sensor.cloud.airquality.AirSensorRequest;
import com.mobile.sensor.cloud.interceptor.LogInterceptor;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Srinivasa Prasad Sunnapu
 */
@Slf4j
@GRpcService(interceptors = { LogInterceptor.class })
public class AirQualitySensorServiceImpl extends AirQualitySensorGrpc.AirQualitySensorImplBase {

    private static final Logger LOG = LoggerFactory.getLogger(AirQualitySensorServiceImpl.class);

    @Value("${sensor.authtoken:authtoken}")
    private String authtoken;

    @Autowired
    private AirQualitySensorDataServiceImpl airQualitySensorDataService;

    private void validate(AirSensorRequest request) {
        if (request == null
                || StringUtils.isEmpty(request.getAuthToken())
                || !authtoken.equalsIgnoreCase(request.getAuthToken())) {
            throw new IllegalArgumentException("Invalid access token!!");
        }
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    @Override
    public void getAirSensorDetails(AirSensorRequest request, StreamObserver<AirSensorDetails> responseObserver) {
        validate(request);

        AirSensorDetails sensorDetails = airQualitySensorDataService.getAirSensorDetails();

        responseObserver.onNext(sensorDetails);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    @Override
    public void getAirSensorData(AirSensorRequest request, StreamObserver<AirSensorData> responseObserver) {
        validate(request);

        AirSensorData sensorData = airQualitySensorDataService.getAirSensorData(AirSensorData.State.G);

        responseObserver.onNext(sensorData);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    @Override
    public void streamAirSensorData(AirSensorRequest request, StreamObserver<AirSensorData> responseObserver) {
        validate(request);

        int dataRequestSize = request.getTimeSpan();
        switch (request.getTimeUnit()) {
            case MINUTE:
                dataRequestSize *= 60;
                break;
            case HOUR:
                dataRequestSize *= 60 * 60;
                break;
            case DAY:
                dataRequestSize *= 60 * 60 * 24;
                break;
            case WEEK:
                dataRequestSize *= 60 * 60 * 24 * 7;
                break;
            case MONTH:
                dataRequestSize *= 60 * 60 * 24 * 7 * 30;
                break;
            case UNRECOGNIZED:
                dataRequestSize *= 10;
                break;
        }
        // generate random data
        List<AirSensorData> data = airQualitySensorDataService.generateRandomData(dataRequestSize, AirSensorData.State.UNRECOGNIZED);
        for (AirSensorData d : data) {
            responseObserver.onNext(d);
        }

        responseObserver.onCompleted();
    }
}
