package com.fudan.ast.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.JwtRequest,
      com.fudan.ast.grpc.lib.JwtTokenResponse> getGenerateJwtTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateJwtToken",
      requestType = com.fudan.ast.grpc.lib.JwtRequest.class,
      responseType = com.fudan.ast.grpc.lib.JwtTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.JwtRequest,
      com.fudan.ast.grpc.lib.JwtTokenResponse> getGenerateJwtTokenMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.JwtRequest, com.fudan.ast.grpc.lib.JwtTokenResponse> getGenerateJwtTokenMethod;
    if ((getGenerateJwtTokenMethod = AuthServiceGrpc.getGenerateJwtTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGenerateJwtTokenMethod = AuthServiceGrpc.getGenerateJwtTokenMethod) == null) {
          AuthServiceGrpc.getGenerateJwtTokenMethod = getGenerateJwtTokenMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.JwtRequest, com.fudan.ast.grpc.lib.JwtTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generateJwtToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.JwtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.JwtTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("generateJwtToken"))
              .build();
        }
      }
    }
    return getGenerateJwtTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.JwtToken,
      com.fudan.ast.grpc.lib.ValidateResponse> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validate",
      requestType = com.fudan.ast.grpc.lib.JwtToken.class,
      responseType = com.fudan.ast.grpc.lib.ValidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.JwtToken,
      com.fudan.ast.grpc.lib.ValidateResponse> getValidateMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.JwtToken, com.fudan.ast.grpc.lib.ValidateResponse> getValidateMethod;
    if ((getValidateMethod = AuthServiceGrpc.getValidateMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getValidateMethod = AuthServiceGrpc.getValidateMethod) == null) {
          AuthServiceGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.JwtToken, com.fudan.ast.grpc.lib.ValidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.JwtToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.ValidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateJwtToken(com.fudan.ast.grpc.lib.JwtRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.JwtTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateJwtTokenMethod(), responseObserver);
    }

    /**
     */
    public void validate(com.fudan.ast.grpc.lib.JwtToken request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.ValidateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateJwtTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.JwtRequest,
                com.fudan.ast.grpc.lib.JwtTokenResponse>(
                  this, METHODID_GENERATE_JWT_TOKEN)))
          .addMethod(
            getValidateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.JwtToken,
                com.fudan.ast.grpc.lib.ValidateResponse>(
                  this, METHODID_VALIDATE)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateJwtToken(com.fudan.ast.grpc.lib.JwtRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.JwtTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateJwtTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validate(com.fudan.ast.grpc.lib.JwtToken request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.ValidateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.JwtTokenResponse generateJwtToken(com.fudan.ast.grpc.lib.JwtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateJwtTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.ValidateResponse validate(com.fudan.ast.grpc.lib.JwtToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.JwtTokenResponse> generateJwtToken(
        com.fudan.ast.grpc.lib.JwtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateJwtTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.ValidateResponse> validate(
        com.fudan.ast.grpc.lib.JwtToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_JWT_TOKEN = 0;
  private static final int METHODID_VALIDATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_JWT_TOKEN:
          serviceImpl.generateJwtToken((com.fudan.ast.grpc.lib.JwtRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.JwtTokenResponse>) responseObserver);
          break;
        case METHODID_VALIDATE:
          serviceImpl.validate((com.fudan.ast.grpc.lib.JwtToken) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.ValidateResponse>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.fudan.ast.grpc.lib.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getGenerateJwtTokenMethod())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
