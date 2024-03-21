// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.fudan.ast.grpc.lib;

/**
 * Protobuf type {@code JwtTokenResponse}
 */
public  final class JwtTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:JwtTokenResponse)
    JwtTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JwtTokenResponse.newBuilder() to construct.
  private JwtTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JwtTokenResponse() {
    jwtToken_ = "";
    valid_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JwtTokenResponse(
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

            jwtToken_ = s;
            break;
          }
          case 16: {

            valid_ = input.readBool();
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
    return com.fudan.ast.grpc.lib.AuthProto.internal_static_JwtTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fudan.ast.grpc.lib.AuthProto.internal_static_JwtTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fudan.ast.grpc.lib.JwtTokenResponse.class, com.fudan.ast.grpc.lib.JwtTokenResponse.Builder.class);
  }

  public static final int JWTTOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object jwtToken_;
  /**
   * <code>string jwtToken = 1;</code>
   */
  public java.lang.String getJwtToken() {
    java.lang.Object ref = jwtToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jwtToken_ = s;
      return s;
    }
  }
  /**
   * <code>string jwtToken = 1;</code>
   */
  public com.google.protobuf.ByteString
      getJwtTokenBytes() {
    java.lang.Object ref = jwtToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jwtToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALID_FIELD_NUMBER = 2;
  private boolean valid_;
  /**
   * <code>bool valid = 2;</code>
   */
  public boolean getValid() {
    return valid_;
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
    if (!getJwtTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jwtToken_);
    }
    if (valid_ != false) {
      output.writeBool(2, valid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJwtTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jwtToken_);
    }
    if (valid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, valid_);
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
    if (!(obj instanceof com.fudan.ast.grpc.lib.JwtTokenResponse)) {
      return super.equals(obj);
    }
    com.fudan.ast.grpc.lib.JwtTokenResponse other = (com.fudan.ast.grpc.lib.JwtTokenResponse) obj;

    boolean result = true;
    result = result && getJwtToken()
        .equals(other.getJwtToken());
    result = result && (getValid()
        == other.getValid());
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
    hash = (37 * hash) + JWTTOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getJwtToken().hashCode();
    hash = (37 * hash) + VALID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fudan.ast.grpc.lib.JwtTokenResponse parseFrom(
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
  public static Builder newBuilder(com.fudan.ast.grpc.lib.JwtTokenResponse prototype) {
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
   * Protobuf type {@code JwtTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:JwtTokenResponse)
      com.fudan.ast.grpc.lib.JwtTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fudan.ast.grpc.lib.AuthProto.internal_static_JwtTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fudan.ast.grpc.lib.AuthProto.internal_static_JwtTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fudan.ast.grpc.lib.JwtTokenResponse.class, com.fudan.ast.grpc.lib.JwtTokenResponse.Builder.class);
    }

    // Construct using com.fudan.ast.grpc.lib.JwtTokenResponse.newBuilder()
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
      jwtToken_ = "";

      valid_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fudan.ast.grpc.lib.AuthProto.internal_static_JwtTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.JwtTokenResponse getDefaultInstanceForType() {
      return com.fudan.ast.grpc.lib.JwtTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.JwtTokenResponse build() {
      com.fudan.ast.grpc.lib.JwtTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fudan.ast.grpc.lib.JwtTokenResponse buildPartial() {
      com.fudan.ast.grpc.lib.JwtTokenResponse result = new com.fudan.ast.grpc.lib.JwtTokenResponse(this);
      result.jwtToken_ = jwtToken_;
      result.valid_ = valid_;
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
      if (other instanceof com.fudan.ast.grpc.lib.JwtTokenResponse) {
        return mergeFrom((com.fudan.ast.grpc.lib.JwtTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fudan.ast.grpc.lib.JwtTokenResponse other) {
      if (other == com.fudan.ast.grpc.lib.JwtTokenResponse.getDefaultInstance()) return this;
      if (!other.getJwtToken().isEmpty()) {
        jwtToken_ = other.jwtToken_;
        onChanged();
      }
      if (other.getValid() != false) {
        setValid(other.getValid());
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
      com.fudan.ast.grpc.lib.JwtTokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fudan.ast.grpc.lib.JwtTokenResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jwtToken_ = "";
    /**
     * <code>string jwtToken = 1;</code>
     */
    public java.lang.String getJwtToken() {
      java.lang.Object ref = jwtToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jwtToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jwtToken = 1;</code>
     */
    public com.google.protobuf.ByteString
        getJwtTokenBytes() {
      java.lang.Object ref = jwtToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jwtToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jwtToken = 1;</code>
     */
    public Builder setJwtToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jwtToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jwtToken = 1;</code>
     */
    public Builder clearJwtToken() {
      
      jwtToken_ = getDefaultInstance().getJwtToken();
      onChanged();
      return this;
    }
    /**
     * <code>string jwtToken = 1;</code>
     */
    public Builder setJwtTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jwtToken_ = value;
      onChanged();
      return this;
    }

    private boolean valid_ ;
    /**
     * <code>bool valid = 2;</code>
     */
    public boolean getValid() {
      return valid_;
    }
    /**
     * <code>bool valid = 2;</code>
     */
    public Builder setValid(boolean value) {
      
      valid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool valid = 2;</code>
     */
    public Builder clearValid() {
      
      valid_ = false;
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


    // @@protoc_insertion_point(builder_scope:JwtTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:JwtTokenResponse)
  private static final com.fudan.ast.grpc.lib.JwtTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fudan.ast.grpc.lib.JwtTokenResponse();
  }

  public static com.fudan.ast.grpc.lib.JwtTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JwtTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<JwtTokenResponse>() {
    @java.lang.Override
    public JwtTokenResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JwtTokenResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JwtTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JwtTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fudan.ast.grpc.lib.JwtTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

