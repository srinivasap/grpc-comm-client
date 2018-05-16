package com.mobile.sensor.cloud.airquality;

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
 * Air quality sensor interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: airqualitysensor.proto")
public final class AirQualitySensorGrpc {

  private AirQualitySensorGrpc() {}

  public static final String SERVICE_NAME = "AirQualitySensor";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAirSensorDetailsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorDetails> METHOD_GET_AIR_SENSOR_DETAILS = getGetAirSensorDetailsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorDetails> getGetAirSensorDetailsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorDetails> getGetAirSensorDetailsMethod() {
    return getGetAirSensorDetailsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorDetails> getGetAirSensorDetailsMethodHelper() {
    io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest, com.mobile.sensor.cloud.airquality.AirSensorDetails> getGetAirSensorDetailsMethod;
    if ((getGetAirSensorDetailsMethod = AirQualitySensorGrpc.getGetAirSensorDetailsMethod) == null) {
      synchronized (AirQualitySensorGrpc.class) {
        if ((getGetAirSensorDetailsMethod = AirQualitySensorGrpc.getGetAirSensorDetailsMethod) == null) {
          AirQualitySensorGrpc.getGetAirSensorDetailsMethod = getGetAirSensorDetailsMethod = 
              io.grpc.MethodDescriptor.<com.mobile.sensor.cloud.airquality.AirSensorRequest, com.mobile.sensor.cloud.airquality.AirSensorDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirQualitySensor", "GetAirSensorDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.airquality.AirSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.airquality.AirSensorDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualitySensorMethodDescriptorSupplier("GetAirSensorDetails"))
                  .build();
          }
        }
     }
     return getGetAirSensorDetailsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAirSensorDataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> METHOD_GET_AIR_SENSOR_DATA = getGetAirSensorDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> getGetAirSensorDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> getGetAirSensorDataMethod() {
    return getGetAirSensorDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> getGetAirSensorDataMethodHelper() {
    io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest, com.mobile.sensor.cloud.airquality.AirSensorData> getGetAirSensorDataMethod;
    if ((getGetAirSensorDataMethod = AirQualitySensorGrpc.getGetAirSensorDataMethod) == null) {
      synchronized (AirQualitySensorGrpc.class) {
        if ((getGetAirSensorDataMethod = AirQualitySensorGrpc.getGetAirSensorDataMethod) == null) {
          AirQualitySensorGrpc.getGetAirSensorDataMethod = getGetAirSensorDataMethod = 
              io.grpc.MethodDescriptor.<com.mobile.sensor.cloud.airquality.AirSensorRequest, com.mobile.sensor.cloud.airquality.AirSensorData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirQualitySensor", "GetAirSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.airquality.AirSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.airquality.AirSensorData.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualitySensorMethodDescriptorSupplier("GetAirSensorData"))
                  .build();
          }
        }
     }
     return getGetAirSensorDataMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStreamAirSensorDataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> METHOD_STREAM_AIR_SENSOR_DATA = getStreamAirSensorDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> getStreamAirSensorDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> getStreamAirSensorDataMethod() {
    return getStreamAirSensorDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest,
      com.mobile.sensor.cloud.airquality.AirSensorData> getStreamAirSensorDataMethodHelper() {
    io.grpc.MethodDescriptor<com.mobile.sensor.cloud.airquality.AirSensorRequest, com.mobile.sensor.cloud.airquality.AirSensorData> getStreamAirSensorDataMethod;
    if ((getStreamAirSensorDataMethod = AirQualitySensorGrpc.getStreamAirSensorDataMethod) == null) {
      synchronized (AirQualitySensorGrpc.class) {
        if ((getStreamAirSensorDataMethod = AirQualitySensorGrpc.getStreamAirSensorDataMethod) == null) {
          AirQualitySensorGrpc.getStreamAirSensorDataMethod = getStreamAirSensorDataMethod = 
              io.grpc.MethodDescriptor.<com.mobile.sensor.cloud.airquality.AirSensorRequest, com.mobile.sensor.cloud.airquality.AirSensorData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "AirQualitySensor", "StreamAirSensorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.airquality.AirSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mobile.sensor.cloud.airquality.AirSensorData.getDefaultInstance()))
                  .setSchemaDescriptor(new AirQualitySensorMethodDescriptorSupplier("StreamAirSensorData"))
                  .build();
          }
        }
     }
     return getStreamAirSensorDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirQualitySensorStub newStub(io.grpc.Channel channel) {
    return new AirQualitySensorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirQualitySensorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirQualitySensorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirQualitySensorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirQualitySensorFutureStub(channel);
  }

  /**
   * <pre>
   * Air quality sensor interface
   * </pre>
   */
  public static abstract class AirQualitySensorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public void getAirSensorDetails(com.mobile.sensor.cloud.airquality.AirSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirSensorDetailsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public void getAirSensorData(com.mobile.sensor.cloud.airquality.AirSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAirSensorDataMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    public void streamAirSensorData(com.mobile.sensor.cloud.airquality.AirSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorData> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamAirSensorDataMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAirSensorDetailsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mobile.sensor.cloud.airquality.AirSensorRequest,
                com.mobile.sensor.cloud.airquality.AirSensorDetails>(
                  this, METHODID_GET_AIR_SENSOR_DETAILS)))
          .addMethod(
            getGetAirSensorDataMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mobile.sensor.cloud.airquality.AirSensorRequest,
                com.mobile.sensor.cloud.airquality.AirSensorData>(
                  this, METHODID_GET_AIR_SENSOR_DATA)))
          .addMethod(
            getStreamAirSensorDataMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.mobile.sensor.cloud.airquality.AirSensorRequest,
                com.mobile.sensor.cloud.airquality.AirSensorData>(
                  this, METHODID_STREAM_AIR_SENSOR_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Air quality sensor interface
   * </pre>
   */
  public static final class AirQualitySensorStub extends io.grpc.stub.AbstractStub<AirQualitySensorStub> {
    private AirQualitySensorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualitySensorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualitySensorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualitySensorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public void getAirSensorDetails(com.mobile.sensor.cloud.airquality.AirSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirSensorDetailsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public void getAirSensorData(com.mobile.sensor.cloud.airquality.AirSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAirSensorDataMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    public void streamAirSensorData(com.mobile.sensor.cloud.airquality.AirSensorRequest request,
        io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamAirSensorDataMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Air quality sensor interface
   * </pre>
   */
  public static final class AirQualitySensorBlockingStub extends io.grpc.stub.AbstractStub<AirQualitySensorBlockingStub> {
    private AirQualitySensorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualitySensorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualitySensorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualitySensorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public com.mobile.sensor.cloud.airquality.AirSensorDetails getAirSensorDetails(com.mobile.sensor.cloud.airquality.AirSensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirSensorDetailsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public com.mobile.sensor.cloud.airquality.AirSensorData getAirSensorData(com.mobile.sensor.cloud.airquality.AirSensorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAirSensorDataMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request stream of sensor data for time range requested - hourly/daily/week/yearly
     * </pre>
     */
    public java.util.Iterator<com.mobile.sensor.cloud.airquality.AirSensorData> streamAirSensorData(
        com.mobile.sensor.cloud.airquality.AirSensorRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamAirSensorDataMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Air quality sensor interface
   * </pre>
   */
  public static final class AirQualitySensorFutureStub extends io.grpc.stub.AbstractStub<AirQualitySensorFutureStub> {
    private AirQualitySensorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirQualitySensorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirQualitySensorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirQualitySensorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtains the sensor details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mobile.sensor.cloud.airquality.AirSensorDetails> getAirSensorDetails(
        com.mobile.sensor.cloud.airquality.AirSensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirSensorDetailsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request most recent data from the sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mobile.sensor.cloud.airquality.AirSensorData> getAirSensorData(
        com.mobile.sensor.cloud.airquality.AirSensorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAirSensorDataMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AIR_SENSOR_DETAILS = 0;
  private static final int METHODID_GET_AIR_SENSOR_DATA = 1;
  private static final int METHODID_STREAM_AIR_SENSOR_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirQualitySensorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirQualitySensorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AIR_SENSOR_DETAILS:
          serviceImpl.getAirSensorDetails((com.mobile.sensor.cloud.airquality.AirSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorDetails>) responseObserver);
          break;
        case METHODID_GET_AIR_SENSOR_DATA:
          serviceImpl.getAirSensorData((com.mobile.sensor.cloud.airquality.AirSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorData>) responseObserver);
          break;
        case METHODID_STREAM_AIR_SENSOR_DATA:
          serviceImpl.streamAirSensorData((com.mobile.sensor.cloud.airquality.AirSensorRequest) request,
              (io.grpc.stub.StreamObserver<com.mobile.sensor.cloud.airquality.AirSensorData>) responseObserver);
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

  private static abstract class AirQualitySensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirQualitySensorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mobile.sensor.cloud.airquality.AirQualitySensorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirQualitySensor");
    }
  }

  private static final class AirQualitySensorFileDescriptorSupplier
      extends AirQualitySensorBaseDescriptorSupplier {
    AirQualitySensorFileDescriptorSupplier() {}
  }

  private static final class AirQualitySensorMethodDescriptorSupplier
      extends AirQualitySensorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirQualitySensorMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirQualitySensorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirQualitySensorFileDescriptorSupplier())
              .addMethod(getGetAirSensorDetailsMethodHelper())
              .addMethod(getGetAirSensorDataMethodHelper())
              .addMethod(getStreamAirSensorDataMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
