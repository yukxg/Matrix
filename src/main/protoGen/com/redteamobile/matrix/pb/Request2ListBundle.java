// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Demo.proto

package com.redteamobile.matrix.pb;

/**
 * <pre>
 * The request message to list bundle for the given merchant code under the given status and type
 * </pre>
 *
 * Protobuf type {@code Request2ListBundle}
 */
public  final class Request2ListBundle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Request2ListBundle)
    Request2ListBundleOrBuilder {
  // Use Request2ListBundle.newBuilder() to construct.
  private Request2ListBundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request2ListBundle() {
    merchantCode_ = "";
    status_ = 0;
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Request2ListBundle(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            merchantCode_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 24: {

            type_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.redteamobile.matrix.pb.Demo.internal_static_Request2ListBundle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.redteamobile.matrix.pb.Demo.internal_static_Request2ListBundle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.redteamobile.matrix.pb.Request2ListBundle.class, com.redteamobile.matrix.pb.Request2ListBundle.Builder.class);
  }

  public static final int MERCHANT_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object merchantCode_;
  /**
   * <code>optional string merchant_code = 1;</code>
   */
  public java.lang.String getMerchantCode() {
    java.lang.Object ref = merchantCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      merchantCode_ = s;
      return s;
    }
  }
  /**
   * <code>optional string merchant_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMerchantCodeBytes() {
    java.lang.Object ref = merchantCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      merchantCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>optional .BundleDetail.BundleStatus status = 2;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .BundleDetail.BundleStatus status = 2;</code>
   */
  public com.redteamobile.matrix.pb.BundleDetail.BundleStatus getStatus() {
    com.redteamobile.matrix.pb.BundleDetail.BundleStatus result = com.redteamobile.matrix.pb.BundleDetail.BundleStatus.valueOf(status_);
    return result == null ? com.redteamobile.matrix.pb.BundleDetail.BundleStatus.UNRECOGNIZED : result;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>optional int32 type = 3;</code>
   */
  public int getType() {
    return type_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMerchantCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, merchantCode_);
    }
    if (status_ != com.redteamobile.matrix.pb.BundleDetail.BundleStatus.ACTIVE.getNumber()) {
      output.writeEnum(2, status_);
    }
    if (type_ != 0) {
      output.writeInt32(3, type_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMerchantCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, merchantCode_);
    }
    if (status_ != com.redteamobile.matrix.pb.BundleDetail.BundleStatus.ACTIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, type_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.redteamobile.matrix.pb.Request2ListBundle)) {
      return super.equals(obj);
    }
    com.redteamobile.matrix.pb.Request2ListBundle other = (com.redteamobile.matrix.pb.Request2ListBundle) obj;

    boolean result = true;
    result = result && getMerchantCode()
        .equals(other.getMerchantCode());
    result = result && status_ == other.status_;
    result = result && (getType()
        == other.getType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MERCHANT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getMerchantCode().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.matrix.pb.Request2ListBundle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.redteamobile.matrix.pb.Request2ListBundle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The request message to list bundle for the given merchant code under the given status and type
   * </pre>
   *
   * Protobuf type {@code Request2ListBundle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Request2ListBundle)
      com.redteamobile.matrix.pb.Request2ListBundleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.redteamobile.matrix.pb.Demo.internal_static_Request2ListBundle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.redteamobile.matrix.pb.Demo.internal_static_Request2ListBundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.redteamobile.matrix.pb.Request2ListBundle.class, com.redteamobile.matrix.pb.Request2ListBundle.Builder.class);
    }

    // Construct using com.redteamobile.matrix.pb.Request2ListBundle.newBuilder()
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
    public Builder clear() {
      super.clear();
      merchantCode_ = "";

      status_ = 0;

      type_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.redteamobile.matrix.pb.Demo.internal_static_Request2ListBundle_descriptor;
    }

    public com.redteamobile.matrix.pb.Request2ListBundle getDefaultInstanceForType() {
      return com.redteamobile.matrix.pb.Request2ListBundle.getDefaultInstance();
    }

    public com.redteamobile.matrix.pb.Request2ListBundle build() {
      com.redteamobile.matrix.pb.Request2ListBundle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.redteamobile.matrix.pb.Request2ListBundle buildPartial() {
      com.redteamobile.matrix.pb.Request2ListBundle result = new com.redteamobile.matrix.pb.Request2ListBundle(this);
      result.merchantCode_ = merchantCode_;
      result.status_ = status_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.redteamobile.matrix.pb.Request2ListBundle) {
        return mergeFrom((com.redteamobile.matrix.pb.Request2ListBundle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.redteamobile.matrix.pb.Request2ListBundle other) {
      if (other == com.redteamobile.matrix.pb.Request2ListBundle.getDefaultInstance()) return this;
      if (!other.getMerchantCode().isEmpty()) {
        merchantCode_ = other.merchantCode_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.redteamobile.matrix.pb.Request2ListBundle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.redteamobile.matrix.pb.Request2ListBundle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object merchantCode_ = "";
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public java.lang.String getMerchantCode() {
      java.lang.Object ref = merchantCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        merchantCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMerchantCodeBytes() {
      java.lang.Object ref = merchantCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        merchantCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public Builder setMerchantCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      merchantCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public Builder clearMerchantCode() {
      
      merchantCode_ = getDefaultInstance().getMerchantCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public Builder setMerchantCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      merchantCode_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .BundleDetail.BundleStatus status = 2;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .BundleDetail.BundleStatus status = 2;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .BundleDetail.BundleStatus status = 2;</code>
     */
    public com.redteamobile.matrix.pb.BundleDetail.BundleStatus getStatus() {
      com.redteamobile.matrix.pb.BundleDetail.BundleStatus result = com.redteamobile.matrix.pb.BundleDetail.BundleStatus.valueOf(status_);
      return result == null ? com.redteamobile.matrix.pb.BundleDetail.BundleStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .BundleDetail.BundleStatus status = 2;</code>
     */
    public Builder setStatus(com.redteamobile.matrix.pb.BundleDetail.BundleStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .BundleDetail.BundleStatus status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <code>optional int32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }
    /**
     * <code>optional int32 type = 3;</code>
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Request2ListBundle)
  }

  // @@protoc_insertion_point(class_scope:Request2ListBundle)
  private static final com.redteamobile.matrix.pb.Request2ListBundle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.redteamobile.matrix.pb.Request2ListBundle();
  }

  public static com.redteamobile.matrix.pb.Request2ListBundle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request2ListBundle>
      PARSER = new com.google.protobuf.AbstractParser<Request2ListBundle>() {
    public Request2ListBundle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request2ListBundle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request2ListBundle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request2ListBundle> getParserForType() {
    return PARSER;
  }

  public com.redteamobile.matrix.pb.Request2ListBundle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

