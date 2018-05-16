package com.mobile.sensor.cloud.service;

import com.mobile.sensor.cloud.interceptor.LogInterceptor;
import com.mobile.sensor.cloud.waterquality.WaterQualitySensorGrpc;
import com.mobile.sensor.cloud.waterquality.WaterSensorData;
import com.mobile.sensor.cloud.waterquality.WaterSensorDetails;
import com.mobile.sensor.cloud.waterquality.WaterSensorRequest;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Srinivasa Prasad Sunnapu
 */
@Slf4j
@GRpcService(interceptors = { LogInterceptor.class })
public class WaterQualitySensorServiceImpl extends WaterQualitySensorGrpc.WaterQualitySensorImplBase {

    @Value("${sensor.authtoken:authtoken}")
    private String authtoken;

    @Autowired
    private WaterQualitySensorDataServiceImpl waterQualitySensorDataService;

    private void validate(WaterSensorRequest request) {
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
    public void getWaterSensorDetails(WaterSensorRequest request, StreamObserver<WaterSensorDetails> responseObserver) {
        validate(request);

        WaterSensorDetails sensorDetails = waterQualitySensorDataService.getWaterSensorDetails();

        responseObserver.onNext(sensorDetails);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    @Override
    public void getWaterSensorData(WaterSensorRequest request, StreamObserver<WaterSensorData> responseObserver) {
        validate(request);

        WaterSensorData sensorData = waterQualitySensorDataService.getWaterSensorData(WaterSensorData.State.G);

        responseObserver.onNext(sensorData);
        responseObserver.onCompleted();
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    @Override
    public void streamWaterSensorData(WaterSensorRequest request, StreamObserver<WaterSensorData> responseObserver) {
        validate(request);

        int dataRequestSize = request.getTimeSpan();
        switch (request.getTimeUnit()) {
            case MINUTE:
                dataRequestSize *= 60;
                break;
            case HOUR:
                dataRequestSize *= (60 * 60);
                break;
            case DAY:
                dataRequestSize *= (60 * 60 * 24);
                break;
            case WEEK:
                dataRequestSize *= (60 * 60 * 24 * 7);
                break;
            case MONTH:
                dataRequestSize *= (60 * 60 * 24 * 7 * 30);
                break;
            case UNRECOGNIZED:
                dataRequestSize *= 10;
                break;
        }
        // generate random data
        List<WaterSensorData> data = waterQualitySensorDataService.generateRandomData(dataRequestSize, WaterSensorData.State.UNRECOGNIZED);
        for (WaterSensorData d : data) {
            responseObserver.onNext(d);
        }

        responseObserver.onCompleted();
    }
}
