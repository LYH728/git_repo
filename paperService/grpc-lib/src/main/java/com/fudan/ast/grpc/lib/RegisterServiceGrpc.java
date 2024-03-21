package com.fudan.ast.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegisterServiceGrpc {

  private RegisterServiceGrpc() {}

  public static final String SERVICE_NAME = "RegisterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.RegisterUserRequest,
      com.fudan.ast.grpc.lib.RegisterUserResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerUser",
      requestType = com.fudan.ast.grpc.lib.RegisterUserRequest.class,
      responseType = com.fudan.ast.grpc.lib.RegisterUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.RegisterUserRequest,
      com.fudan.ast.grpc.lib.RegisterUserResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.RegisterUserRequest, com.fudan.ast.grpc.lib.RegisterUserResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = RegisterServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (RegisterServiceGrpc.class) {
        if ((getRegisterUserMethod = RegisterServiceGrpc.getRegisterUserMethod) == null) {
          RegisterServiceGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.RegisterUserRequest, com.fudan.ast.grpc.lib.RegisterUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.RegisterUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.RegisterUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegisterServiceMethodDescriptorSupplier("registerUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.ValidateEmailRequest,
      com.fudan.ast.grpc.lib.ValidateEmailResponse> getValidateEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateEmail",
      requestType = com.fudan.ast.grpc.lib.ValidateEmailRequest.class,
      responseType = com.fudan.ast.grpc.lib.ValidateEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.ValidateEmailRequest,
      com.fudan.ast.grpc.lib.ValidateEmailResponse> getValidateEmailMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.ValidateEmailRequest, com.fudan.ast.grpc.lib.ValidateEmailResponse> getValidateEmailMethod;
    if ((getValidateEmailMethod = RegisterServiceGrpc.getValidateEmailMethod) == null) {
      synchronized (RegisterServiceGrpc.class) {
        if ((getValidateEmailMethod = RegisterServiceGrpc.getValidateEmailMethod) == null) {
          RegisterServiceGrpc.getValidateEmailMethod = getValidateEmailMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.ValidateEmailRequest, com.fudan.ast.grpc.lib.ValidateEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validateEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.ValidateEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.ValidateEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegisterServiceMethodDescriptorSupplier("validateEmail"))
              .build();
        }
      }
    }
    return getValidateEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServiceStub>() {
        @java.lang.Override
        public RegisterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServiceStub(channel, callOptions);
        }
      };
    return RegisterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServiceBlockingStub>() {
        @java.lang.Override
        public RegisterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServiceBlockingStub(channel, callOptions);
        }
      };
    return RegisterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServiceFutureStub>() {
        @java.lang.Override
        public RegisterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServiceFutureStub(channel, callOptions);
        }
      };
    return RegisterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RegisterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerUser(com.fudan.ast.grpc.lib.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    public void validateEmail(com.fudan.ast.grpc.lib.ValidateEmailRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.ValidateEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateEmailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.RegisterUserRequest,
                com.fudan.ast.grpc.lib.RegisterUserResponse>(
                  this, METHODID_REGISTER_USER)))
          .addMethod(
            getValidateEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.ValidateEmailRequest,
                com.fudan.ast.grpc.lib.ValidateEmailResponse>(
                  this, METHODID_VALIDATE_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class RegisterServiceStub extends io.grpc.stub.AbstractAsyncStub<RegisterServiceStub> {
    private RegisterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerUser(com.fudan.ast.grpc.lib.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateEmail(com.fudan.ast.grpc.lib.ValidateEmailRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.ValidateEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegisterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegisterServiceBlockingStub> {
    private RegisterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.RegisterUserResponse registerUser(com.fudan.ast.grpc.lib.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.ValidateEmailResponse validateEmail(com.fudan.ast.grpc.lib.ValidateEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegisterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RegisterServiceFutureStub> {
    private RegisterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.RegisterUserResponse> registerUser(
        com.fudan.ast.grpc.lib.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.ValidateEmailResponse> validateEmail(
        com.fudan.ast.grpc.lib.ValidateEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_VALIDATE_EMAIL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegisterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegisterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((com.fudan.ast.grpc.lib.RegisterUserRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.RegisterUserResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_EMAIL:
          serviceImpl.validateEmail((com.fudan.ast.grpc.lib.ValidateEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.ValidateEmailResponse>) responseObserver);
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

  private static abstract class RegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegisterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.fudan.ast.grpc.lib.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegisterService");
    }
  }

  private static final class RegisterServiceFileDescriptorSupplier
      extends RegisterServiceBaseDescriptorSupplier {
    RegisterServiceFileDescriptorSupplier() {}
  }

  private static final class RegisterServiceMethodDescriptorSupplier
      extends RegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegisterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegisterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisterServiceFileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getValidateEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
