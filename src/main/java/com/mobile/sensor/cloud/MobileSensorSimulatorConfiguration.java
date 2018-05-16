package com.mobile.sensor.cloud;

import com.mobile.sensor.cloud.service.AirQualitySensorDataServiceImpl;
import com.mobile.sensor.cloud.service.AirQualitySensorServiceImpl;
import com.mobile.sensor.cloud.service.WaterQualitySensorDataServiceImpl;
import com.mobile.sensor.cloud.service.WaterQualitySensorServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Srinivasa Prasad Sunnapu
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackageClasses = MobileSensorSimulatorApplication.class)
public class MobileSensorSimulatorConfiguration {

    @Bean
    public AirQualitySensorServiceImpl airQualitySensorService() {
        return new AirQualitySensorServiceImpl();
    }

    @Bean
    public WaterQualitySensorServiceImpl waterQualitySensorService() {
        return new WaterQualitySensorServiceImpl();
    }

    @Bean
    public AirQualitySensorDataServiceImpl airQualitySensorDataService() {
        return new AirQualitySensorDataServiceImpl();
    }

    @Bean
    public WaterQualitySensorDataServiceImpl waterQualitySensorDataService() {
        return new WaterQualitySensorDataServiceImpl();
    }
}
