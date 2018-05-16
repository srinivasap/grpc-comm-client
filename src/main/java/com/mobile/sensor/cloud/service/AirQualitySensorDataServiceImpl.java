package com.mobile.sensor.cloud.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mobile.sensor.cloud.airquality.AirParameter;
import com.mobile.sensor.cloud.airquality.AirSensorData;
import com.mobile.sensor.cloud.airquality.AirSensorDetails;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author Srinivasa Prasad Sunnapu
 */
@Service
@SuppressWarnings({"deprecation"})
public class AirQualitySensorDataServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(AirQualitySensorDataServiceImpl.class);

    @Value("${sensor.ipaddress:127.0.0.1}")
    private String ipaddress;

    @Value("${sensor.latitude:36.2562}")
    private float latitude;

    @Value("${sensor.longitude:-123.32393}")
    private float longitude;

    @Value("${sensor.provider:scripps}")
    private String provider;

    @Value("${sensor.authtoken:authtoken}")
    private String authtoken;

    @Value("${airquality.data.file.path:/airquality_sensor_data.csv}")
    private String dataFile;

    private AirSensorDetails sensorDetails;

    @PostConstruct
    public void init() {
        sensorDetails = AirSensorDetails.newBuilder()
                .setIpaddress(ipaddress)
                .setLatitude(latitude)
                .setLongitue(longitude)
                .setProvider(provider)
                .setStatus(AirSensorDetails.Status.ACTIVE)
                .setType(AirSensorDetails.Type.AIR)
                .build();
    }

    public AirSensorDetails getAirSensorDetails() {
        return sensorDetails;
    }

    public AirSensorData getAirSensorData(AirSensorData.State indicator) {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime ldt = LocalDateTime.now();
        AirSensorData data = AirSensorData.newBuilder()
                                .setSensorDetails(sensorDetails)
                                .setState(indicator)
                                .setPressure(1.01325f)
                                .setTemparature(73.0f)
                                .setWindspeed(13.0f)
                                .putAllParameters(getAirParameters(indicator))
                                .setRecordedTime(dtf.format(ldt))
                                .build();

        return data;
    }

    public List<AirSensorData> generateRandomData(int recordCount, AirSensorData.State state) {
        List<AirSensorData> data = Lists.newArrayList();

        int size = AirSensorData.State.values().length;
        for (int counter = 0; counter < recordCount; counter++) {
            if (state == AirSensorData.State.UNRECOGNIZED) {
                Random r = new Random();
                int rand = r.nextInt(size);
                state = AirSensorData.State.values()[rand];
            }
            data.add(getAirSensorData(state));
        }

        return data;
    }

    public List<AirSensorData> generateDataFromFile() {
        List<AirSensorData> data = Lists.newArrayList();

        InputStream instream = null;
        LineIterator lineItr = null;
        try {
            instream = this.getClass().getResourceAsStream(dataFile);
            lineItr = IOUtils.lineIterator(instream, StandardCharsets.UTF_8.name());
            while (lineItr.hasNext()) {
                String line = lineItr.nextLine();
                String[] tokens = line.split(",");
                // read entries from file to generate data
            }
        } catch (IOException e) {
            LOG.error("Error while closing file", e);
        } finally {
            IOUtils.closeQuietly(instream);
            LineIterator.closeQuietly(lineItr);
        }

        return data;
    }

    private Map<String, AirParameter> getAirParameters(AirSensorData.State indicator) {

        Map<String, AirParameter> parameters = Maps.newHashMap();

        switch(indicator) {
            case G:
                parameters.put(String.valueOf(getRandomBtwRange(0,50)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.OZONE).setState(AirParameter.State.G).build());
                parameters.put(String.valueOf(getRandomBtwRange(0,75)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.CARBON_MONOXIDE).setState(AirParameter.State.G).build());
                parameters.put(String.valueOf(getRandomBtwRange(0,50)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.NITROGEN_DIOXIDE).setState(AirParameter.State.G).build());
                parameters.put(String.valueOf(getRandomBtwRange(0,50)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.SULPHER).setState(AirParameter.State.G).build());
                break;
            case Y:
                parameters.put(String.valueOf(getRandomBtwRange(50,100)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.OZONE).setState(AirParameter.State.Y).build());
                parameters.put(String.valueOf(getRandomBtwRange(75,100)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.CARBON_MONOXIDE).setState(AirParameter.State.Y).build());
                parameters.put(String.valueOf(getRandomBtwRange(50,100)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.NITROGEN_DIOXIDE).setState(AirParameter.State.Y).build());
                parameters.put(String.valueOf(getRandomBtwRange(50,100)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.SULPHER).setState(AirParameter.State.Y).build());
                break;
            case R:
                parameters.put(String.valueOf(getRandomBtwRange(100,250)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.OZONE).setState(AirParameter.State.R).build());
                parameters.put(String.valueOf(getRandomBtwRange(100,150)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.CARBON_MONOXIDE).setState(AirParameter.State.R).build());
                parameters.put(String.valueOf(getRandomBtwRange(100,250)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.NITROGEN_DIOXIDE).setState(AirParameter.State.R).build());
                parameters.put(String.valueOf(getRandomBtwRange(100,250)), AirParameter.newBuilder().setUnit(AirParameter.Unit.PARTS_PER_MILLION).setAttribute(AirParameter.Attribute.SULPHER).setState(AirParameter.State.R).build());
                break;
            case UNRECOGNIZED:

        }

        return parameters;
    }

    private int getRandomBtwRange(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low) + low;
    }

}
