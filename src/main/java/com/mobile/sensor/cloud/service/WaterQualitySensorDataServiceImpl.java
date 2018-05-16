package com.mobile.sensor.cloud.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mobile.sensor.cloud.waterquality.WaterParameter;
import com.mobile.sensor.cloud.waterquality.WaterSensorData;
import com.mobile.sensor.cloud.waterquality.WaterSensorDetails;
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
public class WaterQualitySensorDataServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(WaterQualitySensorDataServiceImpl.class);

    @Value("${sensor.ipaddress:127.0.0.1}")
    private String ipaddress;

    @Value("${sensor.latitude:36.2562}")
    private float latitude;

    @Value("${sensor.longitude:-123.32393}")
    private float longitude;

    @Value("${sensor.provider:scripps}")
    private String provider;

    @Value("${airquality.data.file.path:/waterquality_sensor_data.csv}")
    private String dataFile;

    private WaterSensorDetails sensorDetails;

    @PostConstruct
    public void init() {
        sensorDetails = WaterSensorDetails.newBuilder()
                .setIpaddress(ipaddress)
                .setLatitude(latitude)
                .setLongitue(longitude)
                .setProvider(provider)
                .setStatus(WaterSensorDetails.Status.ACTIVE)
                .setType(WaterSensorDetails.Type.WATER)
                .build();
    }

    public WaterSensorDetails getWaterSensorDetails() {
        return sensorDetails;
    }

    public WaterSensorData getWaterSensorData(WaterSensorData.State indicator) {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime ldt = LocalDateTime.now();
        WaterSensorData data = WaterSensorData.newBuilder()
                                .setSensorDetails(sensorDetails)
                                .setState(indicator)
                                .setPressure(1.01325f)
                                .setTemparature(73.0f)
                                .putAllParameters(getWaterParameters(indicator))
                                .setRecordedTime(dtf.format(ldt))
                                .build();

        return data;
    }

    public List<WaterSensorData> generateRandomData(int recordCount, WaterSensorData.State state) {
        List<WaterSensorData> data = Lists.newArrayList();

        int size = WaterSensorData.State.values().length;
        for (int counter = 0; counter < recordCount; counter++) {
            while (state == WaterSensorData.State.UNRECOGNIZED) {
                Random r = new Random();
                int rand = r.nextInt(size);
                state = WaterSensorData.State.values()[rand];
            }
            data.add(getWaterSensorData(state));
        }

        return data;
    }

    public List<WaterSensorData> generateDataFromFile() {
        List<WaterSensorData> data = Lists.newArrayList();

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

    private Map<String, WaterParameter> getWaterParameters(WaterSensorData.State indicator) {

        Map<String, WaterParameter> parameters = Maps.newHashMap();

        switch(indicator) {
            case G:
                parameters.put(String.valueOf(getRandomBtwRange(0,10)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.TEMPERATURE).setState(WaterParameter.State.G).build());
                parameters.put(String.valueOf(getRandomBtwRange(0,50)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.PH).setState(WaterParameter.State.G).build());
                parameters.put(String.valueOf(getRandomBtwRange(0,35)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.TURBIDITY).setState(WaterParameter.State.G).build());
                parameters.put(String.valueOf(getRandomBtwRange(0,4)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.CONDUCTIVITY).setState(WaterParameter.State.G).build());
                break;
            case Y:
                parameters.put(String.valueOf(getRandomBtwRange(10,20)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.TEMPERATURE).setState(WaterParameter.State.Y).build());
                parameters.put(String.valueOf(getRandomBtwRange(50,100)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.PH).setState(WaterParameter.State.Y).build());
                parameters.put(String.valueOf(getRandomBtwRange(35,45)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.TURBIDITY).setState(WaterParameter.State.Y).build());
                parameters.put(String.valueOf(getRandomBtwRange(4,6)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.CONDUCTIVITY).setState(WaterParameter.State.Y).build());
                break;
            case R:
                parameters.put(String.valueOf(getRandomBtwRange(20,36)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.TEMPERATURE).setState(WaterParameter.State.R).build());
                parameters.put(String.valueOf(getRandomBtwRange(100,150)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.PH).setState(WaterParameter.State.R).build());
                parameters.put(String.valueOf(getRandomBtwRange(45,55)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.TURBIDITY).setState(WaterParameter.State.R).build());
                parameters.put(String.valueOf(getRandomBtwRange(6,10)), WaterParameter.newBuilder().setUnit(WaterParameter.Unit.PARTS_PER_MILLION).setAttribute(WaterParameter.Attribute.CONDUCTIVITY).setState(WaterParameter.State.R).build());
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
