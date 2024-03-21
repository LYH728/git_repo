// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Paper.proto

package com.fudan.ast.grpc.lib;

/**
 * Protobuf type {@code DownloadPaperRequest}
 */
public  final class DownloadPaperRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DownloadPaperRequest)
    DownloadPaperRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownloadPaperRequest.newBuilder() to construct.
  private DownloadPaperRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownloadPaperRequest() {
    submitterId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DownloadPaperRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            submitterId_ = s;
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
    return com.fudan.ast.grpc.lib.PaperProto.internal_static_DownloadPaperRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fudan.ast.grpc.lib.PaperProto.internal_static_DownloadPaperRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fudan.ast.grpc.lib.DownloadPaperRequest.class, com.fudan.ast.grpc.lib.DownloadPaperRequest.Builder.class);
  }

  public static final int SUBMITTER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object submitterId_;
  /**
   * <code>string submitter_id = 1;</code>
   */
  public java.lang.String getSubmitterId() {
    java.lang.Object ref = submitterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      submitterId_ = s;
      return s;
    }
  }
  /**
   * <code>string submitter_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSubmitterIdBytes() {
    java.lang.Object ref = submitterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      submitterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSubmitterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, submitterId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubmitterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, submitterId_);
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
    if (!(obj instanceof com.fudan.ast.grpc.lib.DownloadPaperRequest)) {
      return super.equals(obj);
    }
    com.fudan.ast.grpc.lib.DownloadPaperRequest other = (com.fudan.ast.grpc.lib.DownloadPaperRequest) obj;

    boolean result = true;
    result = result && getSubmitterId()
        .equals(other.getSubmitterId());
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
    hash = (37 * hash) + SUBMITTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubmitterId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.DownloadPaperRequest parseFrom(
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
  public static Builder newBuilder(com.fudan.ast.grpc.lib.DownloadPaperRequest prototype) {
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
   * Protobuf type {@code DownloadPaperRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DownloadPaperRequest)
      com.fudan.ast.grpc.lib.DownloadPaperRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fudan.ast.grpc.lib.PaperProto.internal_static_DownloadPaperRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fudan.ast.grpc.lib.PaperProto.internal_static_DownloadPaperRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fudan.ast.grpc.lib.DownloadPaperRequest.class, com.fudan.ast.grpc.lib.DownloadPaperRequest.Builder.class);
    }

    // Construct using com.fudan.ast.grpc.lib.DownloadPaperRequest.newBuilder()
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
      submitterId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fudan.ast.grpc.lib.PaperProto.internal_static_DownloadPaperRequest_descriptor;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.DownloadPaperRequest getDefaultInstanceForType() {
      return com.fudan.ast.grpc.lib.DownloadPaperRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.DownloadPaperRequest build() {
      com.fudan.ast.grpc.lib.DownloadPaperRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.DownloadPaperRequest buildPartial() {
      com.fudan.ast.grpc.lib.DownloadPaperRequest result = new com.fudan.ast.grpc.lib.DownloadPaperRequest(this);
      result.submitterId_ = submitterId_;
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
      if (other instanceof com.fudan.ast.grpc.lib.DownloadPaperRequest) {
        return mergeFrom((com.fudan.ast.grpc.lib.DownloadPaperRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fudan.ast.grpc.lib.DownloadPaperRequest other) {
      if (other == com.fudan.ast.grpc.lib.DownloadPaperRequest.getDefaultInstance()) return this;
      if (!other.getSubmitterId().isEmpty()) {
        submitterId_ = other.submitterId_;
        onChanged();
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
      com.fudan.ast.grpc.lib.DownloadPaperRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fudan.ast.grpc.lib.DownloadPaperRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object submitterId_ = "";
    /**
     * <code>string submitter_id = 1;</code>
     */
    public java.lang.String getSubmitterId() {
      java.lang.Object ref = submitterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        submitterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string submitter_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSubmitterIdBytes() {
      java.lang.Object ref = submitterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        submitterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string submitter_id = 1;</code>
     */
    public Builder setSubmitterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      submitterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string submitter_id = 1;</code>
     */
    public Builder clearSubmitterId() {
      
      submitterId_ = getDefaultInstance().getSubmitterId();
      onChanged();
      return this;
    }
    /**
     * <code>string submitter_id = 1;</code>
     */
    public Builder setSubmitterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      submitterId_ = value;
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


    // @@protoc_insertion_point(builder_scope:DownloadPaperRequest)
  }

  // @@protoc_insertion_point(class_scope:DownloadPaperRequest)
  private static final com.fudan.ast.grpc.lib.DownloadPaperRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fudan.ast.grpc.lib.DownloadPaperRequest();
  }

  public static com.fudan.ast.grpc.lib.DownloadPaperRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownloadPaperRequest>
      PARSER = new com.google.protobuf.AbstractParser<DownloadPaperRequest>() {
    @java.lang.Override
    public DownloadPaperRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DownloadPaperRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DownloadPaperRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownloadPaperRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fudan.ast.grpc.lib.DownloadPaperRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

