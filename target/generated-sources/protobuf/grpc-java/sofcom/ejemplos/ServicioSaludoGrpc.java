package sofcom.ejemplos;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: hello_grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServicioSaludoGrpc {

  private ServicioSaludoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ServicioSaludo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sofcom.ejemplos.ClientInput,
      sofcom.ejemplos.ServerOutput> getSaludoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saludo",
      requestType = sofcom.ejemplos.ClientInput.class,
      responseType = sofcom.ejemplos.ServerOutput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sofcom.ejemplos.ClientInput,
      sofcom.ejemplos.ServerOutput> getSaludoMethod() {
    io.grpc.MethodDescriptor<sofcom.ejemplos.ClientInput, sofcom.ejemplos.ServerOutput> getSaludoMethod;
    if ((getSaludoMethod = ServicioSaludoGrpc.getSaludoMethod) == null) {
      synchronized (ServicioSaludoGrpc.class) {
        if ((getSaludoMethod = ServicioSaludoGrpc.getSaludoMethod) == null) {
          ServicioSaludoGrpc.getSaludoMethod = getSaludoMethod =
              io.grpc.MethodDescriptor.<sofcom.ejemplos.ClientInput, sofcom.ejemplos.ServerOutput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saludo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sofcom.ejemplos.ClientInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sofcom.ejemplos.ServerOutput.getDefaultInstance()))
              .setSchemaDescriptor(new ServicioSaludoMethodDescriptorSupplier("saludo"))
              .build();
        }
      }
    }
    return getSaludoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServicioSaludoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoStub>() {
        @java.lang.Override
        public ServicioSaludoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioSaludoStub(channel, callOptions);
        }
      };
    return ServicioSaludoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServicioSaludoBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoBlockingV2Stub>() {
        @java.lang.Override
        public ServicioSaludoBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioSaludoBlockingV2Stub(channel, callOptions);
        }
      };
    return ServicioSaludoBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServicioSaludoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoBlockingStub>() {
        @java.lang.Override
        public ServicioSaludoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioSaludoBlockingStub(channel, callOptions);
        }
      };
    return ServicioSaludoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServicioSaludoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServicioSaludoFutureStub>() {
        @java.lang.Override
        public ServicioSaludoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServicioSaludoFutureStub(channel, callOptions);
        }
      };
    return ServicioSaludoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saludo(sofcom.ejemplos.ClientInput request,
        io.grpc.stub.StreamObserver<sofcom.ejemplos.ServerOutput> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaludoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServicioSaludo.
   */
  public static abstract class ServicioSaludoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServicioSaludoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServicioSaludo.
   */
  public static final class ServicioSaludoStub
      extends io.grpc.stub.AbstractAsyncStub<ServicioSaludoStub> {
    private ServicioSaludoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioSaludoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioSaludoStub(channel, callOptions);
    }

    /**
     */
    public void saludo(sofcom.ejemplos.ClientInput request,
        io.grpc.stub.StreamObserver<sofcom.ejemplos.ServerOutput> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaludoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServicioSaludo.
   */
  public static final class ServicioSaludoBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServicioSaludoBlockingV2Stub> {
    private ServicioSaludoBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioSaludoBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioSaludoBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public sofcom.ejemplos.ServerOutput saludo(sofcom.ejemplos.ClientInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaludoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ServicioSaludo.
   */
  public static final class ServicioSaludoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServicioSaludoBlockingStub> {
    private ServicioSaludoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioSaludoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioSaludoBlockingStub(channel, callOptions);
    }

    /**
     */
    public sofcom.ejemplos.ServerOutput saludo(sofcom.ejemplos.ClientInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaludoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServicioSaludo.
   */
  public static final class ServicioSaludoFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServicioSaludoFutureStub> {
    private ServicioSaludoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicioSaludoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServicioSaludoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sofcom.ejemplos.ServerOutput> saludo(
        sofcom.ejemplos.ClientInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaludoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALUDO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALUDO:
          serviceImpl.saludo((sofcom.ejemplos.ClientInput) request,
              (io.grpc.stub.StreamObserver<sofcom.ejemplos.ServerOutput>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSaludoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sofcom.ejemplos.ClientInput,
              sofcom.ejemplos.ServerOutput>(
                service, METHODID_SALUDO)))
        .build();
  }

  private static abstract class ServicioSaludoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServicioSaludoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sofcom.ejemplos.HelloGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServicioSaludo");
    }
  }

  private static final class ServicioSaludoFileDescriptorSupplier
      extends ServicioSaludoBaseDescriptorSupplier {
    ServicioSaludoFileDescriptorSupplier() {}
  }

  private static final class ServicioSaludoMethodDescriptorSupplier
      extends ServicioSaludoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServicioSaludoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServicioSaludoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicioSaludoFileDescriptorSupplier())
              .addMethod(getSaludoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
