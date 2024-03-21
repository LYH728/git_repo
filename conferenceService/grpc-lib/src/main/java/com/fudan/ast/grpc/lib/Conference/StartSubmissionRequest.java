// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conference.proto

package com.fudan.ast.grpc.lib.Conference;

/**
 * Protobuf type {@code conference.StartSubmissionRequest}
 */
public  final class StartSubmissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:conference.StartSubmissionRequest)
    StartSubmissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartSubmissionRequest.newBuilder() to construct.
  private StartSubmissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartSubmissionRequest() {
    conferenceId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StartSubmissionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            conferenceId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_StartSubmissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_StartSubmissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.class, com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.Builder.class);
  }

  public static final int CONFERENCE_ID_FIELD_NUMBER = 1;
  private int conferenceId_;
  /**
   * <code>int32 conference_id = 1;</code>
   */
  public int getConferenceId() {
    return conferenceId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (conferenceId_ != 0) {
      output.writeInt32(1, conferenceId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conferenceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, conferenceId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest)) {
      return super.equals(obj);
    }
    com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest other = (com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest) obj;

    boolean result = true;
    result = result && (getConferenceId()
        == other.getConferenceId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONFERENCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConferenceId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code conference.StartSubmissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:conference.StartSubmissionRequest)
      com.fudan.ast.grpc.lib.Conference.StartSubmissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_StartSubmissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_StartSubmissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.class, com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.Builder.class);
    }

    // Construct using com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      conferenceId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_StartSubmissionRequest_descriptor;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest getDefaultInstanceForType() {
      return com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest build() {
      com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest buildPartial() {
      com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest result = new com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest(this);
      result.conferenceId_ = conferenceId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest) {
        return mergeFrom((com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest other) {
      if (other == com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest.getDefaultInstance()) return this;
      if (other.getConferenceId() != 0) {
        setConferenceId(other.getConferenceId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int conferenceId_ ;
    /**
     * <code>int32 conference_id = 1;</code>
     */
    public int getConferenceId() {
      return conferenceId_;
    }
    /**
     * <code>int32 conference_id = 1;</code>
     */
    public Builder setConferenceId(int value) {
      
      conferenceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 conference_id = 1;</code>
     */
    public Builder clearConferenceId() {
      
      conferenceId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:conference.StartSubmissionRequest)
  }

  // @@protoc_insertion_point(class_scope:conference.StartSubmissionRequest)
  private static final com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest();
  }

  public static com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartSubmissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<StartSubmissionRequest>() {
    @java.lang.Override
    public StartSubmissionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StartSubmissionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StartSubmissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartSubmissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fudan.ast.grpc.lib.Conference.StartSubmissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

