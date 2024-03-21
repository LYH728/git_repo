package com.fudan.ast.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: Paper.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PaperServiceGrpc {

  private PaperServiceGrpc() {}

  public static final String SERVICE_NAME = "PaperService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.AvailablePapersRequest,
      com.fudan.ast.grpc.lib.AvailablePapersResponse> getGetAvailablePapersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailablePapers",
      requestType = com.fudan.ast.grpc.lib.AvailablePapersRequest.class,
      responseType = com.fudan.ast.grpc.lib.AvailablePapersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.AvailablePapersRequest,
      com.fudan.ast.grpc.lib.AvailablePapersResponse> getGetAvailablePapersMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.AvailablePapersRequest, com.fudan.ast.grpc.lib.AvailablePapersResponse> getGetAvailablePapersMethod;
    if ((getGetAvailablePapersMethod = PaperServiceGrpc.getGetAvailablePapersMethod) == null) {
      synchronized (PaperServiceGrpc.class) {
        if ((getGetAvailablePapersMethod = PaperServiceGrpc.getGetAvailablePapersMethod) == null) {
          PaperServiceGrpc.getGetAvailablePapersMethod = getGetAvailablePapersMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.AvailablePapersRequest, com.fudan.ast.grpc.lib.AvailablePapersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailablePapers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.AvailablePapersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.AvailablePapersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaperServiceMethodDescriptorSupplier("GetAvailablePapers"))
              .build();
        }
      }
    }
    return getGetAvailablePapersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.AddPaperToSessionRequest,
      com.fudan.ast.grpc.lib.AddPaperToSessionResponse> getAddPaperToSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPaperToSession",
      requestType = com.fudan.ast.grpc.lib.AddPaperToSessionRequest.class,
      responseType = com.fudan.ast.grpc.lib.AddPaperToSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.AddPaperToSessionRequest,
      com.fudan.ast.grpc.lib.AddPaperToSessionResponse> getAddPaperToSessionMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.AddPaperToSessionRequest, com.fudan.ast.grpc.lib.AddPaperToSessionResponse> getAddPaperToSessionMethod;
    if ((getAddPaperToSessionMethod = PaperServiceGrpc.getAddPaperToSessionMethod) == null) {
      synchronized (PaperServiceGrpc.class) {
        if ((getAddPaperToSessionMethod = PaperServiceGrpc.getAddPaperToSessionMethod) == null) {
          PaperServiceGrpc.getAddPaperToSessionMethod = getAddPaperToSessionMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.AddPaperToSessionRequest, com.fudan.ast.grpc.lib.AddPaperToSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPaperToSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.AddPaperToSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.AddPaperToSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaperServiceMethodDescriptorSupplier("AddPaperToSession"))
              .build();
        }
      }
    }
    return getAddPaperToSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest,
      com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse> getDeletePaperFromSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePaperFromSession",
      requestType = com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest.class,
      responseType = com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest,
      com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse> getDeletePaperFromSessionMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest, com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse> getDeletePaperFromSessionMethod;
    if ((getDeletePaperFromSessionMethod = PaperServiceGrpc.getDeletePaperFromSessionMethod) == null) {
      synchronized (PaperServiceGrpc.class) {
        if ((getDeletePaperFromSessionMethod = PaperServiceGrpc.getDeletePaperFromSessionMethod) == null) {
          PaperServiceGrpc.getDeletePaperFromSessionMethod = getDeletePaperFromSessionMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest, com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePaperFromSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaperServiceMethodDescriptorSupplier("DeletePaperFromSession"))
              .build();
        }
      }
    }
    return getDeletePaperFromSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.DownloadPaperRequest,
      com.fudan.ast.grpc.lib.DownloadPaperResponse> getDownloadPaperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadPaper",
      requestType = com.fudan.ast.grpc.lib.DownloadPaperRequest.class,
      responseType = com.fudan.ast.grpc.lib.DownloadPaperResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.DownloadPaperRequest,
      com.fudan.ast.grpc.lib.DownloadPaperResponse> getDownloadPaperMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.DownloadPaperRequest, com.fudan.ast.grpc.lib.DownloadPaperResponse> getDownloadPaperMethod;
    if ((getDownloadPaperMethod = PaperServiceGrpc.getDownloadPaperMethod) == null) {
      synchronized (PaperServiceGrpc.class) {
        if ((getDownloadPaperMethod = PaperServiceGrpc.getDownloadPaperMethod) == null) {
          PaperServiceGrpc.getDownloadPaperMethod = getDownloadPaperMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.DownloadPaperRequest, com.fudan.ast.grpc.lib.DownloadPaperResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadPaper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.DownloadPaperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.DownloadPaperResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaperServiceMethodDescriptorSupplier("DownloadPaper"))
              .build();
        }
      }
    }
    return getDownloadPaperMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaperServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaperServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaperServiceStub>() {
        @java.lang.Override
        public PaperServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaperServiceStub(channel, callOptions);
        }
      };
    return PaperServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaperServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaperServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaperServiceBlockingStub>() {
        @java.lang.Override
        public PaperServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaperServiceBlockingStub(channel, callOptions);
        }
      };
    return PaperServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaperServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaperServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaperServiceFutureStub>() {
        @java.lang.Override
        public PaperServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaperServiceFutureStub(channel, callOptions);
        }
      };
    return PaperServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PaperServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAvailablePapers(com.fudan.ast.grpc.lib.AvailablePapersRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.AvailablePapersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailablePapersMethod(), responseObserver);
    }

    /**
     */
    public void addPaperToSession(com.fudan.ast.grpc.lib.AddPaperToSessionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.AddPaperToSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPaperToSessionMethod(), responseObserver);
    }

    /**
     */
    public void deletePaperFromSession(com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePaperFromSessionMethod(), responseObserver);
    }

    /**
     */
    public void downloadPaper(com.fudan.ast.grpc.lib.DownloadPaperRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.DownloadPaperResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadPaperMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAvailablePapersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.AvailablePapersRequest,
                com.fudan.ast.grpc.lib.AvailablePapersResponse>(
                  this, METHODID_GET_AVAILABLE_PAPERS)))
          .addMethod(
            getAddPaperToSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.AddPaperToSessionRequest,
                com.fudan.ast.grpc.lib.AddPaperToSessionResponse>(
                  this, METHODID_ADD_PAPER_TO_SESSION)))
          .addMethod(
            getDeletePaperFromSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest,
                com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse>(
                  this, METHODID_DELETE_PAPER_FROM_SESSION)))
          .addMethod(
            getDownloadPaperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.DownloadPaperRequest,
                com.fudan.ast.grpc.lib.DownloadPaperResponse>(
                  this, METHODID_DOWNLOAD_PAPER)))
          .build();
    }
  }

  /**
   */
  public static final class PaperServiceStub extends io.grpc.stub.AbstractAsyncStub<PaperServiceStub> {
    private PaperServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaperServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaperServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAvailablePapers(com.fudan.ast.grpc.lib.AvailablePapersRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.AvailablePapersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailablePapersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPaperToSession(com.fudan.ast.grpc.lib.AddPaperToSessionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.AddPaperToSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPaperToSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePaperFromSession(com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePaperFromSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadPaper(com.fudan.ast.grpc.lib.DownloadPaperRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.DownloadPaperResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadPaperMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaperServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaperServiceBlockingStub> {
    private PaperServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaperServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaperServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.AvailablePapersResponse getAvailablePapers(com.fudan.ast.grpc.lib.AvailablePapersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailablePapersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.AddPaperToSessionResponse addPaperToSession(com.fudan.ast.grpc.lib.AddPaperToSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPaperToSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse deletePaperFromSession(com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePaperFromSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.DownloadPaperResponse downloadPaper(com.fudan.ast.grpc.lib.DownloadPaperRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadPaperMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaperServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaperServiceFutureStub> {
    private PaperServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaperServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaperServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.AvailablePapersResponse> getAvailablePapers(
        com.fudan.ast.grpc.lib.AvailablePapersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailablePapersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.AddPaperToSessionResponse> addPaperToSession(
        com.fudan.ast.grpc.lib.AddPaperToSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPaperToSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse> deletePaperFromSession(
        com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePaperFromSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.DownloadPaperResponse> downloadPaper(
        com.fudan.ast.grpc.lib.DownloadPaperRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadPaperMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AVAILABLE_PAPERS = 0;
  private static final int METHODID_ADD_PAPER_TO_SESSION = 1;
  private static final int METHODID_DELETE_PAPER_FROM_SESSION = 2;
  private static final int METHODID_DOWNLOAD_PAPER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaperServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaperServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AVAILABLE_PAPERS:
          serviceImpl.getAvailablePapers((com.fudan.ast.grpc.lib.AvailablePapersRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.AvailablePapersResponse>) responseObserver);
          break;
        case METHODID_ADD_PAPER_TO_SESSION:
          serviceImpl.addPaperToSession((com.fudan.ast.grpc.lib.AddPaperToSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.AddPaperToSessionResponse>) responseObserver);
          break;
        case METHODID_DELETE_PAPER_FROM_SESSION:
          serviceImpl.deletePaperFromSession((com.fudan.ast.grpc.lib.DeletePaperFromSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.DeletePaperFromSessionResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_PAPER:
          serviceImpl.downloadPaper((com.fudan.ast.grpc.lib.DownloadPaperRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.DownloadPaperResponse>) responseObserver);
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

  private static abstract class PaperServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaperServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.fudan.ast.grpc.lib.PaperProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaperService");
    }
  }

  private static final class PaperServiceFileDescriptorSupplier
      extends PaperServiceBaseDescriptorSupplier {
    PaperServiceFileDescriptorSupplier() {}
  }

  private static final class PaperServiceMethodDescriptorSupplier
      extends PaperServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaperServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaperServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaperServiceFileDescriptorSupplier())
              .addMethod(getGetAvailablePapersMethod())
              .addMethod(getAddPaperToSessionMethod())
              .addMethod(getDeletePaperFromSessionMethod())
              .addMethod(getDownloadPaperMethod())
              .build();
        }
      }
    }
    return result;
  }
}
