package com.fudan.ast.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: Submission.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubmissionServiceGrpc {

  private SubmissionServiceGrpc() {}

  public static final String SERVICE_NAME = "SubmissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.CreateSubmissionRequest,
      com.fudan.ast.grpc.lib.CreateSubmissionResponse> getCreateSubmissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSubmission",
      requestType = com.fudan.ast.grpc.lib.CreateSubmissionRequest.class,
      responseType = com.fudan.ast.grpc.lib.CreateSubmissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.CreateSubmissionRequest,
      com.fudan.ast.grpc.lib.CreateSubmissionResponse> getCreateSubmissionMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.CreateSubmissionRequest, com.fudan.ast.grpc.lib.CreateSubmissionResponse> getCreateSubmissionMethod;
    if ((getCreateSubmissionMethod = SubmissionServiceGrpc.getCreateSubmissionMethod) == null) {
      synchronized (SubmissionServiceGrpc.class) {
        if ((getCreateSubmissionMethod = SubmissionServiceGrpc.getCreateSubmissionMethod) == null) {
          SubmissionServiceGrpc.getCreateSubmissionMethod = getCreateSubmissionMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.CreateSubmissionRequest, com.fudan.ast.grpc.lib.CreateSubmissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSubmission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.CreateSubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.CreateSubmissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmissionServiceMethodDescriptorSupplier("CreateSubmission"))
              .build();
        }
      }
    }
    return getCreateSubmissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubmissionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceStub>() {
        @java.lang.Override
        public SubmissionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceStub(channel, callOptions);
        }
      };
    return SubmissionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubmissionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceBlockingStub>() {
        @java.lang.Override
        public SubmissionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceBlockingStub(channel, callOptions);
        }
      };
    return SubmissionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubmissionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmissionServiceFutureStub>() {
        @java.lang.Override
        public SubmissionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmissionServiceFutureStub(channel, callOptions);
        }
      };
    return SubmissionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SubmissionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSubmission(com.fudan.ast.grpc.lib.CreateSubmissionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.CreateSubmissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSubmissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSubmissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.CreateSubmissionRequest,
                com.fudan.ast.grpc.lib.CreateSubmissionResponse>(
                  this, METHODID_CREATE_SUBMISSION)))
          .build();
    }
  }

  /**
   */
  public static final class SubmissionServiceStub extends io.grpc.stub.AbstractAsyncStub<SubmissionServiceStub> {
    private SubmissionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSubmission(com.fudan.ast.grpc.lib.CreateSubmissionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.CreateSubmissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSubmissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubmissionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SubmissionServiceBlockingStub> {
    private SubmissionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.CreateSubmissionResponse createSubmission(com.fudan.ast.grpc.lib.CreateSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSubmissionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubmissionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SubmissionServiceFutureStub> {
    private SubmissionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmissionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmissionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.CreateSubmissionResponse> createSubmission(
        com.fudan.ast.grpc.lib.CreateSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSubmissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBMISSION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubmissionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubmissionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SUBMISSION:
          serviceImpl.createSubmission((com.fudan.ast.grpc.lib.CreateSubmissionRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.CreateSubmissionResponse>) responseObserver);
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

  private static abstract class SubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubmissionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.fudan.ast.grpc.lib.SubmissionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubmissionService");
    }
  }

  private static final class SubmissionServiceFileDescriptorSupplier
      extends SubmissionServiceBaseDescriptorSupplier {
    SubmissionServiceFileDescriptorSupplier() {}
  }

  private static final class SubmissionServiceMethodDescriptorSupplier
      extends SubmissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubmissionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubmissionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubmissionServiceFileDescriptorSupplier())
              .addMethod(getCreateSubmissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
