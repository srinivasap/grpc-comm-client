package com.mobile.sensor.cloud.waterquality;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * water quality sensor interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: waterqualitysensor.proto")
public final class WaterQualitySensorGrpc {

  private WaterQualitySensorGrpc() {}

  public static final String SERVICE_NAME = "WaterQualitySensor";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetWaterSensorDetailsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorDetails> METHOD_GET_WATER_SENSOR_DETAILS = getGetWaterSensorDetailsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorDetails> getGetWaterSensorDetailsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorDetails> getGetWaterSensorDetailsMethod() {
    return getGetWaterSensorDetailsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorDetails> getGetWaterSensorDetailsMethodHelper() {
    io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest, com.mobile.sensor.cloud.waterquality.WaterSensorDetails> getGetWaterSensorDetailsMethod;
    if ((getGetWaterSensorDetailsMethod = WaterQualitySensorGrpc.getGetWaterSensorDetailsMethod) == null) {
      synchronized (WaterQualitySensorGrpc.class) {
        if ((getGetWaterSensorDetailsMethod = WaterQualitySensorGrpc.getGetWaterSensorDetailsMethod) == null) {
          WaterQualitySensorGrpc.getGetWaterSensorDetailsMethod = getGetWaterSensorDetailsMethod = 
              io.grpc.MethodDescriptor.<com.mobile.sensor.cloud.waterquality.WaterSensorRequest, com.mobile.sensor.cloud.waterquality.WaterSensorDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "WaterQualitySensor", "GetWaterSensorDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.waterquality.WaterSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.waterquality.WaterSensorDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterQualitySensorMethodDescriptorSupplier("GetWaterSensorDetails"))
                  .build();
          }
        }
     }
     return getGetWaterSensorDetailsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetWaterSensorDataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> METHOD_GET_WATER_SENSOR_DATA = getGetWaterSensorDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> getGetWaterSensorDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> getGetWaterSensorDataMethod() {
    return getGetWaterSensorDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> getGetWaterSensorDataMethodHelper() {
    io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest, com.mobile.sensor.cloud.waterquality.WaterSensorData> getGetWaterSensorDataMethod;
    if ((getGetWaterSensorDataMethod = WaterQualitySensorGrpc.getGetWaterSensorDataMethod) == null) {
      synchronized (WaterQualitySensorGrpc.class) {
        if ((getGetWaterSensorDataMethod = WaterQualitySensorGrpc.getGetWaterSensorDataMethod) == null) {
          WaterQualitySensorGrpc.getGetWaterSensorDataMethod = getGetWaterSensorDataMethod = 
              io.grpc.MethodDescriptor.<com.mobile.sensor.cloud.waterquality.WaterSensorRequest, com.mobile.sensor.cloud.waterquality.WaterSensorData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "WaterQualitySensor", "GetWaterSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.waterquality.WaterSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.waterquality.WaterSensorData.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterQualitySensorMethodDescriptorSupplier("GetWaterSensorData"))
                  .build();
          }
        }
     }
     return getGetWaterSensorDataMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStreamWaterSensorDataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> METHOD_STREAM_WATER_SENSOR_DATA = getStreamWaterSensorDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> getStreamWaterSensorDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> getStreamWaterSensorDataMethod() {
    return getStreamWaterSensorDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
      com.mobile.sensor.cloud.waterquality.WaterSensorData> getStreamWaterSensorDataMethodHelper() {
    io.grpc.MethodDescriptor<com.mobile.sensor.cloud.waterquality.WaterSensorRequest, com.mobile.sensor.cloud.waterquality.WaterSensorData> getStreamWaterSensorDataMethod;
    if ((getStreamWaterSensorDataMethod = WaterQualitySensorGrpc.getStreamWaterSensorDataMethod) == null) {
      synchronized (WaterQualitySensorGrpc.class) {
        if ((getStreamWaterSensorDataMethod = WaterQualitySensorGrpc.getStreamWaterSensorDataMethod) == null) {
          WaterQualitySensorGrpc.getStreamWaterSensorDataMethod = getStreamWaterSensorDataMethod = 
              io.grpc.MethodDescriptor.<com.mobile.sensor.cloud.waterquality.WaterSensorRequest, com.mobile.sensor.cloud.waterquality.WaterSensorData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "WaterQualitySensor", "StreamWaterSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.waterquality.WaterSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.waterquality.WaterSensorData.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterQualitySensorMethodDescriptorSupplier("StreamWaterSensorData"))
                  .build();
          }
        }
     }
     return getStreamWaterSensorDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterQualitySensorStub newStub(io.grpc.Channel channel) {
    return new WaterQualitySensorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterQualitySensorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterQualitySensorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterQualitySensorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterQualitySensorFutureStub(channel);
  }

  /**
   * <pre>
   * water quality sensor interface
   * </pre>
   */
  public static abstract class WaterQualitySensorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public void getWaterSensorDetails(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterSensorDetailsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public void getWaterSensorData(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaterSensorDataMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    public void streamWaterSensorData(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorData> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamWaterSensorDataMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaterSensorDetailsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
                com.mobile.sensor.cloud.waterquality.WaterSensorDetails>(
                  this, METHODID_GET_WATER_SENSOR_DETAILS)))
          .addMethod(
            getGetWaterSensorDataMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
                com.mobile.sensor.cloud.waterquality.WaterSensorData>(
                  this, METHODID_GET_WATER_SENSOR_DATA)))
          .addMethod(
            getStreamWaterSensorDataMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mobile.sensor.cloud.waterquality.WaterSensorRequest,
                com.mobile.sensor.cloud.waterquality.WaterSensorData>(
                  this, METHODID_STREAM_WATER_SENSOR_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * water quality sensor interface
   * </pre>
   */
  public static final class WaterQualitySensorStub extends io.grpc.stub.AbstractStub<WaterQualitySensorStub> {
    private WaterQualitySensorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterQualitySensorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterQualitySensorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterQualitySensorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public void getWaterSensorDetails(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaterSensorDetailsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public void getWaterSensorData(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaterSensorDataMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    public void streamWaterSensorData(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamWaterSensorDataMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * water quality sensor interface
   * </pre>
   */
  public static final class WaterQualitySensorBlockingStub extends io.grpc.stub.AbstractStub<WaterQualitySensorBlockingStub> {
    private WaterQualitySensorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterQualitySensorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterQualitySensorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterQualitySensorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public com.mobile.sensor.cloud.waterquality.WaterSensorDetails getWaterSensorDetails(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaterSensorDetailsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public com.mobile.sensor.cloud.waterquality.WaterSensorData getWaterSensorData(com.mobile.sensor.cloud.waterquality.WaterSensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaterSensorDataMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    public java.util.Iterator<com.mobile.sensor.cloud.waterquality.WaterSensorData> streamWaterSensorData(
        com.mobile.sensor.cloud.waterquality.WaterSensorRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamWaterSensorDataMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * water quality sensor interface
   * </pre>
   */
  public static final class WaterQualitySensorFutureStub extends io.grpc.stub.AbstractStub<WaterQualitySensorFutureStub> {
    private WaterQualitySensorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterQualitySensorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterQualitySensorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterQualitySensorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mobile.sensor.cloud.waterquality.WaterSensorDetails> getWaterSensorDetails(
        com.mobile.sensor.cloud.waterquality.WaterSensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaterSensorDetailsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mobile.sensor.cloud.waterquality.WaterSensorData> getWaterSensorData(
        com.mobile.sensor.cloud.waterquality.WaterSensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaterSensorDataMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WATER_SENSOR_DETAILS = 0;
  private static final int METHODID_GET_WATER_SENSOR_DATA = 1;
  private static final int METHODID_STREAM_WATER_SENSOR_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterQualitySensorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterQualitySensorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WATER_SENSOR_DETAILS:
          serviceImpl.getWaterSensorDetails((com.mobile.sensor.cloud.waterquality.WaterSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorDetails>) responseObserver);
          break;
        case METHODID_GET_WATER_SENSOR_DATA:
          serviceImpl.getWaterSensorData((com.mobile.sensor.cloud.waterquality.WaterSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorData>) responseObserver);
          break;
        case METHODID_STREAM_WATER_SENSOR_DATA:
          serviceImpl.streamWaterSensorData((com.mobile.sensor.cloud.waterquality.WaterSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.waterquality.WaterSensorData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WaterQualitySensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterQualitySensorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mobile.sensor.cloud.waterquality.WaterQualitySensorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterQualitySensor");
    }
  }

  private static final class WaterQualitySensorFileDescriptorSupplier
      extends WaterQualitySensorBaseDescriptorSupplier {
    WaterQualitySensorFileDescriptorSupplier() {}
  }

  private static final class WaterQualitySensorMethodDescriptorSupplier
      extends WaterQualitySensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterQualitySensorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WaterQualitySensorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterQualitySensorFileDescriptorSupplier())
              .addMethod(getGetWaterSensorDetailsMethodHelper())
              .addMethod(getGetWaterSensorDataMethodHelper())
              .addMethod(getStreamWaterSensorDataMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
