// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airqualitysensor.proto

package com.mobile.sensor.cloud.airquality;

public interface AirSensorDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AirSensorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ipaddress = 1;</code>
   */
  java.lang.String getIpaddress();
  /**
   * <code>string ipaddress = 1;</code>
   */
  com.google.protobuf.ByteString
      getIpaddressBytes();

  /**
   * <code>float latitude = 2;</code>
   */
  float getLatitude();

  /**
   * <code>float longitue = 3;</code>
   */
  float getLongitue();

  /**
   * <code>string provider = 4;</code>
   */
  java.lang.String getProvider();
  /**
   * <code>string provider = 4;</code>
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>.AirSensorDetails.Type type = 6;</code>
   */
  int getTypeValue();
  /**
   * <code>.AirSensorDetails.Type type = 6;</code>
   */
  com.mobile.sensor.cloud.airquality.AirSensorDetails.Type getType();

  /**
   * <code>.AirSensorDetails.Status status = 5;</code>
   */
  int getStatusValue();
  /**
   * <code>.AirSensorDetails.Status status = 5;</code>
   */
  com.mobile.sensor.cloud.airquality.AirSensorDetails.Status getStatus();
}
