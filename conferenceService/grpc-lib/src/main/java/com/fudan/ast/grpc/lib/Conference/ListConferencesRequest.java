// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conference.proto

package com.fudan.ast.grpc.lib.Conference;

/**
 * Protobuf type {@code conference.ListConferencesRequest}
 */
public  final class ListConferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:conference.ListConferencesRequest)
    ListConferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConferencesRequest.newBuilder() to construct.
  private ListConferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConferencesRequest() {
    pageSize_ = 0;
    pageNumber_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListConferencesRequest(
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

            pageSize_ = input.readInt32();
            break;
          }
          case 16: {

            pageNumber_ = input.readInt32();
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
    return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_ListConferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_ListConferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.class, com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.Builder.class);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 1;
  private int pageSize_;
  /**
   * <code>int32 page_size = 1;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
  private int pageNumber_;
  /**
   * <code>int32 page_number = 2;</code>
   */
  public int getPageNumber() {
    return pageNumber_;
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
    if (pageSize_ != 0) {
      output.writeInt32(1, pageSize_);
    }
    if (pageNumber_ != 0) {
      output.writeInt32(2, pageNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pageSize_);
    }
    if (pageNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageNumber_);
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
    if (!(obj instanceof com.fudan.ast.grpc.lib.Conference.ListConferencesRequest)) {
      return super.equals(obj);
    }
    com.fudan.ast.grpc.lib.Conference.ListConferencesRequest other = (com.fudan.ast.grpc.lib.Conference.ListConferencesRequest) obj;

    boolean result = true;
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && (getPageNumber()
        == other.getPageNumber());
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
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPageNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parseFrom(
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
  public static Builder newBuilder(com.fudan.ast.grpc.lib.Conference.ListConferencesRequest prototype) {
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
   * Protobuf type {@code conference.ListConferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:conference.ListConferencesRequest)
      com.fudan.ast.grpc.lib.Conference.ListConferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_ListConferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_ListConferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.class, com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.Builder.class);
    }

    // Construct using com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.newBuilder()
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
      pageSize_ = 0;

      pageNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fudan.ast.grpc.lib.Conference.ConferenceProto.internal_static_conference_ListConferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.Conference.ListConferencesRequest getDefaultInstanceForType() {
      return com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.Conference.ListConferencesRequest build() {
      com.fudan.ast.grpc.lib.Conference.ListConferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.Conference.ListConferencesRequest buildPartial() {
      com.fudan.ast.grpc.lib.Conference.ListConferencesRequest result = new com.fudan.ast.grpc.lib.Conference.ListConferencesRequest(this);
      result.pageSize_ = pageSize_;
      result.pageNumber_ = pageNumber_;
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
      if (other instanceof com.fudan.ast.grpc.lib.Conference.ListConferencesRequest) {
        return mergeFrom((com.fudan.ast.grpc.lib.Conference.ListConferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fudan.ast.grpc.lib.Conference.ListConferencesRequest other) {
      if (other == com.fudan.ast.grpc.lib.Conference.ListConferencesRequest.getDefaultInstance()) return this;
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (other.getPageNumber() != 0) {
        setPageNumber(other.getPageNumber());
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
      com.fudan.ast.grpc.lib.Conference.ListConferencesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fudan.ast.grpc.lib.Conference.ListConferencesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>int32 page_size = 1;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int32 page_size = 1;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_size = 1;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private int pageNumber_ ;
    /**
     * <code>int32 page_number = 2;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>int32 page_number = 2;</code>
     */
    public Builder setPageNumber(int value) {
      
      pageNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_number = 2;</code>
     */
    public Builder clearPageNumber() {
      
      pageNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:conference.ListConferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:conference.ListConferencesRequest)
  private static final com.fudan.ast.grpc.lib.Conference.ListConferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fudan.ast.grpc.lib.Conference.ListConferencesRequest();
  }

  public static com.fudan.ast.grpc.lib.Conference.ListConferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListConferencesRequest>() {
    @java.lang.Override
    public ListConferencesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListConferencesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListConferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fudan.ast.grpc.lib.Conference.ListConferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

