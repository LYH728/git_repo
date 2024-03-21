package com.fudan.ast.grpc.lib.Conference;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: conference.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConferenceServiceGrpc {

  private ConferenceServiceGrpc() {}

  public static final String SERVICE_NAME = "conference.ConferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest,
      com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse> getInvitePcMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvitePcMember",
      requestType = com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest,
      com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse> getInvitePcMemberMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest, com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse> getInvitePcMemberMethod;
    if ((getInvitePcMemberMethod = ConferenceServiceGrpc.getInvitePcMemberMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getInvitePcMemberMethod = ConferenceServiceGrpc.getInvitePcMemberMethod) == null) {
          ConferenceServiceGrpc.getInvitePcMemberMethod = getInvitePcMemberMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest, com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvitePcMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("InvitePcMember"))
              .build();
        }
      }
    }
    return getInvitePcMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest,
      com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse> getConfirmPcMemberInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmPcMemberInvitation",
      requestType = com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest,
      com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse> getConfirmPcMemberInvitationMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest, com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse> getConfirmPcMemberInvitationMethod;
    if ((getConfirmPcMemberInvitationMethod = ConferenceServiceGrpc.getConfirmPcMemberInvitationMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getConfirmPcMemberInvitationMethod = ConferenceServiceGrpc.getConfirmPcMemberInvitationMethod) == null) {
          ConferenceServiceGrpc.getConfirmPcMemberInvitationMethod = getConfirmPcMemberInvitationMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest, com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmPcMemberInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("ConfirmPcMemberInvitation"))
              .build();
        }
      }
    }
    return getConfirmPcMemberInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse> getCreateConferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConference",
      requestType = com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse> getCreateConferenceMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest, com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse> getCreateConferenceMethod;
    if ((getCreateConferenceMethod = ConferenceServiceGrpc.getCreateConferenceMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getCreateConferenceMethod = ConferenceServiceGrpc.getCreateConferenceMethod) == null) {
          ConferenceServiceGrpc.getCreateConferenceMethod = getCreateConferenceMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest, com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("CreateConference"))
              .build();
        }
      }
    }
    return getCreateConferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse> getConfirmCreateConferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmCreateConference",
      requestType = com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse> getConfirmCreateConferenceMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest, com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse> getConfirmCreateConferenceMethod;
    if ((getConfirmCreateConferenceMethod = ConferenceServiceGrpc.getConfirmCreateConferenceMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getConfirmCreateConferenceMethod = ConferenceServiceGrpc.getConfirmCreateConferenceMethod) == null) {
          ConferenceServiceGrpc.getConfirmCreateConferenceMethod = getConfirmCreateConferenceMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest, com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmCreateConference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("ConfirmCreateConference"))
              .build();
        }
      }
    }
    return getConfirmCreateConferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.GetConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.Conference> getGetConferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConference",
      requestType = com.fudan.ast.grpc.lib.Conference.GetConferenceRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.Conference.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.GetConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.Conference> getGetConferenceMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.GetConferenceRequest, com.fudan.ast.grpc.lib.Conference.Conference> getGetConferenceMethod;
    if ((getGetConferenceMethod = ConferenceServiceGrpc.getGetConferenceMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getGetConferenceMethod = ConferenceServiceGrpc.getGetConferenceMethod) == null) {
          ConferenceServiceGrpc.getGetConferenceMethod = getGetConferenceMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.GetConferenceRequest, com.fudan.ast.grpc.lib.Conference.Conference>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.GetConferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.Conference.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("GetConference"))
              .build();
        }
      }
    }
    return getGetConferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ListConferencesRequest,
      com.fudan.ast.grpc.lib.Conference.ListConferencesResponse> getListConferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConferences",
      requestType = com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.ListConferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ListConferencesRequest,
      com.fudan.ast.grpc.lib.Conference.ListConferencesResponse> getListConferencesMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.ListConferencesRequest, com.fudan.ast.grpc.lib.Conference.ListConferencesResponse> getListConferencesMethod;
    if ((getListConferencesMethod = ConferenceServiceGrpc.getListConferencesMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getListConferencesMethod = ConferenceServiceGrpc.getListConferencesMethod) == null) {
          ConferenceServiceGrpc.getListConferencesMethod = getListConferencesMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.ListConferencesRequest, com.fudan.ast.grpc.lib.Conference.ListConferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.ListConferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("ListConferences"))
              .build();
        }
      }
    }
    return getListConferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse> getUpdateConferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConference",
      requestType = com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest,
      com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse> getUpdateConferenceMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest, com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse> getUpdateConferenceMethod;
    if ((getUpdateConferenceMethod = ConferenceServiceGrpc.getUpdateConferenceMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getUpdateConferenceMethod = ConferenceServiceGrpc.getUpdateConferenceMethod) == null) {
          ConferenceServiceGrpc.getUpdateConferenceMethod = getUpdateConferenceMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest, com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("UpdateConference"))
              .build();
        }
      }
    }
    return getUpdateConferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.AddPaperRequest,
      com.fudan.ast.grpc.lib.Conference.AddPaperResponse> getAddPaperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPaper",
      requestType = com.fudan.ast.grpc.lib.Conference.AddPaperRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.AddPaperResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.AddPaperRequest,
      com.fudan.ast.grpc.lib.Conference.AddPaperResponse> getAddPaperMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.AddPaperRequest, com.fudan.ast.grpc.lib.Conference.AddPaperResponse> getAddPaperMethod;
    if ((getAddPaperMethod = ConferenceServiceGrpc.getAddPaperMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getAddPaperMethod = ConferenceServiceGrpc.getAddPaperMethod) == null) {
          ConferenceServiceGrpc.getAddPaperMethod = getAddPaperMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.AddPaperRequest, com.fudan.ast.grpc.lib.Conference.AddPaperResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPaper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.AddPaperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.AddPaperResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("AddPaper"))
              .build();
        }
      }
    }
    return getAddPaperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest,
      com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse> getStartSubmissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartSubmission",
      requestType = com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest,
      com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse> getStartSubmissionMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest, com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse> getStartSubmissionMethod;
    if ((getStartSubmissionMethod = ConferenceServiceGrpc.getStartSubmissionMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getStartSubmissionMethod = ConferenceServiceGrpc.getStartSubmissionMethod) == null) {
          ConferenceServiceGrpc.getStartSubmissionMethod = getStartSubmissionMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest, com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartSubmission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("StartSubmission"))
              .build();
        }
      }
    }
    return getStartSubmissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest,
      com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse> getEndSubmissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndSubmission",
      requestType = com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest.class,
      responseType = com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest,
      com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse> getEndSubmissionMethod() {
    io.grpc.MethodDescriptor<com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest, com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse> getEndSubmissionMethod;
    if ((getEndSubmissionMethod = ConferenceServiceGrpc.getEndSubmissionMethod) == null) {
      synchronized (ConferenceServiceGrpc.class) {
        if ((getEndSubmissionMethod = ConferenceServiceGrpc.getEndSubmissionMethod) == null) {
          ConferenceServiceGrpc.getEndSubmissionMethod = getEndSubmissionMethod =
              io.grpc.MethodDescriptor.<com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest, com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndSubmission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConferenceServiceMethodDescriptorSupplier("EndSubmission"))
              .build();
        }
      }
    }
    return getEndSubmissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConferenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConferenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConferenceServiceStub>() {
        @java.lang.Override
        public ConferenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConferenceServiceStub(channel, callOptions);
        }
      };
    return ConferenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConferenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConferenceServiceBlockingStub>() {
        @java.lang.Override
        public ConferenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConferenceServiceBlockingStub(channel, callOptions);
        }
      };
    return ConferenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConferenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConferenceServiceFutureStub>() {
        @java.lang.Override
        public ConferenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConferenceServiceFutureStub(channel, callOptions);
        }
      };
    return ConferenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConferenceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void invitePcMember(com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInvitePcMemberMethod(), responseObserver);
    }

    /**
     */
    public void confirmPcMemberInvitation(com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmPcMemberInvitationMethod(), responseObserver);
    }

    /**
     */
    public void createConference(com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConferenceMethod(), responseObserver);
    }

    /**
     */
    public void confirmCreateConference(com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmCreateConferenceMethod(), responseObserver);
    }

    /**
     */
    public void getConference(com.fudan.ast.grpc.lib.Conference.GetConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.Conference> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConferenceMethod(), responseObserver);
    }

    /**
     */
    public void listConferences(com.fudan.ast.grpc.lib.Conference.ListConferencesRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ListConferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConferencesMethod(), responseObserver);
    }

    /**
     */
    public void updateConference(com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConferenceMethod(), responseObserver);
    }

    /**
     */
    public void addPaper(com.fudan.ast.grpc.lib.Conference.AddPaperRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.AddPaperResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPaperMethod(), responseObserver);
    }

    /**
     */
    public void startSubmission(com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartSubmissionMethod(), responseObserver);
    }

    /**
     */
    public void endSubmission(com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndSubmissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInvitePcMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest,
                com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse>(
                  this, METHODID_INVITE_PC_MEMBER)))
          .addMethod(
            getConfirmPcMemberInvitationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest,
                com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse>(
                  this, METHODID_CONFIRM_PC_MEMBER_INVITATION)))
          .addMethod(
            getCreateConferenceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest,
                com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse>(
                  this, METHODID_CREATE_CONFERENCE)))
          .addMethod(
            getConfirmCreateConferenceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest,
                com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse>(
                  this, METHODID_CONFIRM_CREATE_CONFERENCE)))
          .addMethod(
            getGetConferenceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.GetConferenceRequest,
                com.fudan.ast.grpc.lib.Conference.Conference>(
                  this, METHODID_GET_CONFERENCE)))
          .addMethod(
            getListConferencesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.ListConferencesRequest,
                com.fudan.ast.grpc.lib.Conference.ListConferencesResponse>(
                  this, METHODID_LIST_CONFERENCES)))
          .addMethod(
            getUpdateConferenceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest,
                com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse>(
                  this, METHODID_UPDATE_CONFERENCE)))
          .addMethod(
            getAddPaperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.AddPaperRequest,
                com.fudan.ast.grpc.lib.Conference.AddPaperResponse>(
                  this, METHODID_ADD_PAPER)))
          .addMethod(
            getStartSubmissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest,
                com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse>(
                  this, METHODID_START_SUBMISSION)))
          .addMethod(
            getEndSubmissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest,
                com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse>(
                  this, METHODID_END_SUBMISSION)))
          .build();
    }
  }

  /**
   */
  public static final class ConferenceServiceStub extends io.grpc.stub.AbstractAsyncStub<ConferenceServiceStub> {
    private ConferenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConferenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConferenceServiceStub(channel, callOptions);
    }

    /**
     */
    public void invitePcMember(com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInvitePcMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmPcMemberInvitation(com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmPcMemberInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createConference(com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmCreateConference(com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmCreateConferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConference(com.fudan.ast.grpc.lib.Conference.GetConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.Conference> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listConferences(com.fudan.ast.grpc.lib.Conference.ListConferencesRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ListConferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateConference(com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPaper(com.fudan.ast.grpc.lib.Conference.AddPaperRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.AddPaperResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPaperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startSubmission(com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartSubmissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endSubmission(com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest request,
        io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndSubmissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConferenceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConferenceServiceBlockingStub> {
    private ConferenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConferenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse invitePcMember(com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInvitePcMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse confirmPcMemberInvitation(com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmPcMemberInvitationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse createConference(com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse confirmCreateConference(com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmCreateConferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.Conference getConference(com.fudan.ast.grpc.lib.Conference.GetConferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.ListConferencesResponse listConferences(com.fudan.ast.grpc.lib.Conference.ListConferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConferencesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse updateConference(com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.AddPaperResponse addPaper(com.fudan.ast.grpc.lib.Conference.AddPaperRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPaperMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse startSubmission(com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartSubmissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse endSubmission(com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndSubmissionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConferenceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConferenceServiceFutureStub> {
    private ConferenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConferenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConferenceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse> invitePcMember(
        com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInvitePcMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse> confirmPcMemberInvitation(
        com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmPcMemberInvitationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse> createConference(
        com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse> confirmCreateConference(
        com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmCreateConferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.Conference> getConference(
        com.fudan.ast.grpc.lib.Conference.GetConferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.ListConferencesResponse> listConferences(
        com.fudan.ast.grpc.lib.Conference.ListConferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConferencesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse> updateConference(
        com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.AddPaperResponse> addPaper(
        com.fudan.ast.grpc.lib.Conference.AddPaperRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPaperMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse> startSubmission(
        com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartSubmissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse> endSubmission(
        com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndSubmissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INVITE_PC_MEMBER = 0;
  private static final int METHODID_CONFIRM_PC_MEMBER_INVITATION = 1;
  private static final int METHODID_CREATE_CONFERENCE = 2;
  private static final int METHODID_CONFIRM_CREATE_CONFERENCE = 3;
  private static final int METHODID_GET_CONFERENCE = 4;
  private static final int METHODID_LIST_CONFERENCES = 5;
  private static final int METHODID_UPDATE_CONFERENCE = 6;
  private static final int METHODID_ADD_PAPER = 7;
  private static final int METHODID_START_SUBMISSION = 8;
  private static final int METHODID_END_SUBMISSION = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConferenceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConferenceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INVITE_PC_MEMBER:
          serviceImpl.invitePcMember((com.fudan.ast.grpc.lib.Conference.InvitePcMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.InvitePcMemberResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_PC_MEMBER_INVITATION:
          serviceImpl.confirmPcMemberInvitation((com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ConfirmPcMemberInvitationResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONFERENCE:
          serviceImpl.createConference((com.fudan.ast.grpc.lib.Conference.CreateConferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.CreateConferenceResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_CREATE_CONFERENCE:
          serviceImpl.confirmCreateConference((com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ConfirmCreateConferenceResponse>) responseObserver);
          break;
        case METHODID_GET_CONFERENCE:
          serviceImpl.getConference((com.fudan.ast.grpc.lib.Conference.GetConferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.Conference>) responseObserver);
          break;
        case METHODID_LIST_CONFERENCES:
          serviceImpl.listConferences((com.fudan.ast.grpc.lib.Conference.ListConferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.ListConferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONFERENCE:
          serviceImpl.updateConference((com.fudan.ast.grpc.lib.Conference.UpdateConferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.UpdateConferenceResponse>) responseObserver);
          break;
        case METHODID_ADD_PAPER:
          serviceImpl.addPaper((com.fudan.ast.grpc.lib.Conference.AddPaperRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.AddPaperResponse>) responseObserver);
          break;
        case METHODID_START_SUBMISSION:
          serviceImpl.startSubmission((com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.StartSubmissionResponse>) responseObserver);
          break;
        case METHODID_END_SUBMISSION:
          serviceImpl.endSubmission((com.fudan.ast.grpc.lib.Conference.EndSubmissionRequest) request,
              (io.grpc.stub.StreamObserver<com.fudan.ast.grpc.lib.Conference.EndSubmissionResponse>) responseObserver);
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

  private static abstract class ConferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConferenceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConferenceService");
    }
  }

  private static final class ConferenceServiceFileDescriptorSupplier
      extends ConferenceServiceBaseDescriptorSupplier {
    ConferenceServiceFileDescriptorSupplier() {}
  }

  private static final class ConferenceServiceMethodDescriptorSupplier
      extends ConferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConferenceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConferenceServiceFileDescriptorSupplier())
              .addMethod(getInvitePcMemberMethod())
              .addMethod(getConfirmPcMemberInvitationMethod())
              .addMethod(getCreateConferenceMethod())
              .addMethod(getConfirmCreateConferenceMethod())
              .addMethod(getGetConferenceMethod())
              .addMethod(getListConferencesMethod())
              .addMethod(getUpdateConferenceMethod())
              .addMethod(getAddPaperMethod())
              .addMethod(getStartSubmissionMethod())
              .addMethod(getEndSubmissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
