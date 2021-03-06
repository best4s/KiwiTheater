// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: im-java.proto

package protobuf.generate.webapp;

public final class ImPto {
  private ImPto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ImType}
   */
  public enum ImType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ImHandShake = 1;</code>
     */
    ImHandShake(1),
    /**
     * <code>ImChClose = 2;</code>
     */
    ImChClose(2),
    /**
     * <code>SysAnnouncement = 3;</code>
     */
    SysAnnouncement(3),
    /**
     * <code>Danmaku = 4;</code>
     */
    Danmaku(4),
    /**
     * <code>Gift = 5;</code>
     */
    Gift(5),
    ;

    /**
     * <code>ImHandShake = 1;</code>
     */
    public static final int ImHandShake_VALUE = 1;
    /**
     * <code>ImChClose = 2;</code>
     */
    public static final int ImChClose_VALUE = 2;
    /**
     * <code>SysAnnouncement = 3;</code>
     */
    public static final int SysAnnouncement_VALUE = 3;
    /**
     * <code>Danmaku = 4;</code>
     */
    public static final int Danmaku_VALUE = 4;
    /**
     * <code>Gift = 5;</code>
     */
    public static final int Gift_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ImType valueOf(int value) {
      return forNumber(value);
    }

    public static ImType forNumber(int value) {
      switch (value) {
        case 1: return ImHandShake;
        case 2: return ImChClose;
        case 3: return SysAnnouncement;
        case 4: return Danmaku;
        case 5: return Gift;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ImType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ImType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImType>() {
            public ImType findValueByNumber(int number) {
              return ImType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ImPto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ImType[] VALUES = values();

    public static ImType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ImType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ImType)
  }

  public interface ImOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Im)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *(require)通信的类型
     * </pre>
     *
     * <code>required .ImType imType = 1;</code>
     */
    boolean hasImType();
    /**
     * <pre>
     *(require)通信的类型
     * </pre>
     *
     * <code>required .ImType imType = 1;</code>
     */
    ImType getImType();

    /**
     * <pre>
     *发送人
     * </pre>
     *
     * <code>optional uint32 senderid = 2;</code>
     */
    boolean hasSenderid();
    /**
     * <pre>
     *发送人
     * </pre>
     *
     * <code>optional uint32 senderid = 2;</code>
     */
    int getSenderid();

    /**
     * <code>optional string sendername = 3;</code>
     */
    boolean hasSendername();
    /**
     * <code>optional string sendername = 3;</code>
     */
    String getSendername();
    /**
     * <code>optional string sendername = 3;</code>
     */
    com.google.protobuf.ByteString
        getSendernameBytes();

    /**
     * <code>optional uint32 roomid = 4;</code>
     */
    boolean hasRoomid();
    /**
     * <code>optional uint32 roomid = 4;</code>
     */
    int getRoomid();

    /**
     * <code>optional string content = 5;</code>
     */
    boolean hasContent();
    /**
     * <code>optional string content = 5;</code>
     */
    String getContent();
    /**
     * <code>optional string content = 5;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();
  }
  /**
   * Protobuf type {@code Im}
   */
  public  static final class Im extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Im)
      ImOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Im.newBuilder() to construct.
    private Im(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Im() {
      imType_ = 1;
      senderid_ = 0;
      sendername_ = "";
      roomid_ = 0;
      content_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Im(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              ImType value = ImType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                imType_ = rawValue;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              senderid_ = input.readUInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              sendername_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              roomid_ = input.readUInt32();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              content_ = bs;
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
      return ImPto.internal_static_Im_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ImPto.internal_static_Im_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Im.class, Builder.class);
    }

    private int bitField0_;
    public static final int IMTYPE_FIELD_NUMBER = 1;
    private int imType_;
    /**
     * <pre>
     *(require)通信的类型
     * </pre>
     *
     * <code>required .ImType imType = 1;</code>
     */
    public boolean hasImType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *(require)通信的类型
     * </pre>
     *
     * <code>required .ImType imType = 1;</code>
     */
    public ImType getImType() {
      ImType result = ImType.valueOf(imType_);
      return result == null ? ImType.ImHandShake : result;
    }

    public static final int SENDERID_FIELD_NUMBER = 2;
    private int senderid_;
    /**
     * <pre>
     *发送人
     * </pre>
     *
     * <code>optional uint32 senderid = 2;</code>
     */
    public boolean hasSenderid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *发送人
     * </pre>
     *
     * <code>optional uint32 senderid = 2;</code>
     */
    public int getSenderid() {
      return senderid_;
    }

    public static final int SENDERNAME_FIELD_NUMBER = 3;
    private volatile Object sendername_;
    /**
     * <code>optional string sendername = 3;</code>
     */
    public boolean hasSendername() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string sendername = 3;</code>
     */
    public String getSendername() {
      Object ref = sendername_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sendername_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sendername = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSendernameBytes() {
      Object ref = sendername_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sendername_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROOMID_FIELD_NUMBER = 4;
    private int roomid_;
    /**
     * <code>optional uint32 roomid = 4;</code>
     */
    public boolean hasRoomid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 roomid = 4;</code>
     */
    public int getRoomid() {
      return roomid_;
    }

    public static final int CONTENT_FIELD_NUMBER = 5;
    private volatile Object content_;
    /**
     * <code>optional string content = 5;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string content = 5;</code>
     */
    public String getContent() {
      Object ref = content_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string content = 5;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasImType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, imType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, senderid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sendername_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, roomid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, content_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, imType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, senderid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sendername_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, roomid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, content_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Im)) {
        return super.equals(obj);
      }
      Im other = (Im) obj;

      boolean result = true;
      result = result && (hasImType() == other.hasImType());
      if (hasImType()) {
        result = result && imType_ == other.imType_;
      }
      result = result && (hasSenderid() == other.hasSenderid());
      if (hasSenderid()) {
        result = result && (getSenderid()
            == other.getSenderid());
      }
      result = result && (hasSendername() == other.hasSendername());
      if (hasSendername()) {
        result = result && getSendername()
            .equals(other.getSendername());
      }
      result = result && (hasRoomid() == other.hasRoomid());
      if (hasRoomid()) {
        result = result && (getRoomid()
            == other.getRoomid());
      }
      result = result && (hasContent() == other.hasContent());
      if (hasContent()) {
        result = result && getContent()
            .equals(other.getContent());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasImType()) {
        hash = (37 * hash) + IMTYPE_FIELD_NUMBER;
        hash = (53 * hash) + imType_;
      }
      if (hasSenderid()) {
        hash = (37 * hash) + SENDERID_FIELD_NUMBER;
        hash = (53 * hash) + getSenderid();
      }
      if (hasSendername()) {
        hash = (37 * hash) + SENDERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getSendername().hashCode();
      }
      if (hasRoomid()) {
        hash = (37 * hash) + ROOMID_FIELD_NUMBER;
        hash = (53 * hash) + getRoomid();
      }
      if (hasContent()) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Im parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Im parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Im parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Im parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Im parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Im parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Im parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Im parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Im parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Im parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Im parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Im parseFrom(
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
    public static Builder newBuilder(Im prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Im}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Im)
        ImOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ImPto.internal_static_Im_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ImPto.internal_static_Im_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Im.class, Builder.class);
      }

      // Construct using protobuf.generate.webapp.ImPto.Im.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
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
        imType_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        senderid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        sendername_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        roomid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ImPto.internal_static_Im_descriptor;
      }

      public Im getDefaultInstanceForType() {
        return Im.getDefaultInstance();
      }

      public Im build() {
        Im result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Im buildPartial() {
        Im result = new Im(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.imType_ = imType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.senderid_ = senderid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sendername_ = sendername_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.roomid_ = roomid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof Im) {
          return mergeFrom((Im)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Im other) {
        if (other == Im.getDefaultInstance()) return this;
        if (other.hasImType()) {
          setImType(other.getImType());
        }
        if (other.hasSenderid()) {
          setSenderid(other.getSenderid());
        }
        if (other.hasSendername()) {
          bitField0_ |= 0x00000004;
          sendername_ = other.sendername_;
          onChanged();
        }
        if (other.hasRoomid()) {
          setRoomid(other.getRoomid());
        }
        if (other.hasContent()) {
          bitField0_ |= 0x00000010;
          content_ = other.content_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasImType()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Im parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Im) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int imType_ = 1;
      /**
       * <pre>
       *(require)通信的类型
       * </pre>
       *
       * <code>required .ImType imType = 1;</code>
       */
      public boolean hasImType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       *(require)通信的类型
       * </pre>
       *
       * <code>required .ImType imType = 1;</code>
       */
      public ImType getImType() {
        ImType result = ImType.valueOf(imType_);
        return result == null ? ImType.ImHandShake : result;
      }
      /**
       * <pre>
       *(require)通信的类型
       * </pre>
       *
       * <code>required .ImType imType = 1;</code>
       */
      public Builder setImType(ImType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        imType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *(require)通信的类型
       * </pre>
       *
       * <code>required .ImType imType = 1;</code>
       */
      public Builder clearImType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        imType_ = 1;
        onChanged();
        return this;
      }

      private int senderid_ ;
      /**
       * <pre>
       *发送人
       * </pre>
       *
       * <code>optional uint32 senderid = 2;</code>
       */
      public boolean hasSenderid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       *发送人
       * </pre>
       *
       * <code>optional uint32 senderid = 2;</code>
       */
      public int getSenderid() {
        return senderid_;
      }
      /**
       * <pre>
       *发送人
       * </pre>
       *
       * <code>optional uint32 senderid = 2;</code>
       */
      public Builder setSenderid(int value) {
        bitField0_ |= 0x00000002;
        senderid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *发送人
       * </pre>
       *
       * <code>optional uint32 senderid = 2;</code>
       */
      public Builder clearSenderid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        senderid_ = 0;
        onChanged();
        return this;
      }

      private Object sendername_ = "";
      /**
       * <code>optional string sendername = 3;</code>
       */
      public boolean hasSendername() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string sendername = 3;</code>
       */
      public String getSendername() {
        Object ref = sendername_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sendername_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string sendername = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSendernameBytes() {
        Object ref = sendername_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          sendername_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sendername = 3;</code>
       */
      public Builder setSendername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        sendername_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sendername = 3;</code>
       */
      public Builder clearSendername() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sendername_ = getDefaultInstance().getSendername();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sendername = 3;</code>
       */
      public Builder setSendernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        sendername_ = value;
        onChanged();
        return this;
      }

      private int roomid_ ;
      /**
       * <code>optional uint32 roomid = 4;</code>
       */
      public boolean hasRoomid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 roomid = 4;</code>
       */
      public int getRoomid() {
        return roomid_;
      }
      /**
       * <code>optional uint32 roomid = 4;</code>
       */
      public Builder setRoomid(int value) {
        bitField0_ |= 0x00000008;
        roomid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 roomid = 4;</code>
       */
      public Builder clearRoomid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        roomid_ = 0;
        onChanged();
        return this;
      }

      private Object content_ = "";
      /**
       * <code>optional string content = 5;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string content = 5;</code>
       */
      public String getContent() {
        Object ref = content_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            content_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string content = 5;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string content = 5;</code>
       */
      public Builder setContent(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 5;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000010);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>optional string content = 5;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        content_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Im)
    }

    // @@protoc_insertion_point(class_scope:Im)
    private static final Im DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Im();
    }

    public static Im getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<Im>
        PARSER = new com.google.protobuf.AbstractParser<Im>() {
      public Im parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Im(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Im> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Im> getParserForType() {
      return PARSER;
    }

    public Im getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Im_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Im_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rim-java.proto\"d\n\002Im\022\027\n\006imType\030\001 \002(\0162\007." +
      "ImType\022\020\n\010senderid\030\002 \001(\r\022\022\n\nsendername\030\003" +
      " \001(\t\022\016\n\006roomid\030\004 \001(\r\022\017\n\007content\030\005 \001(\t*T\n" +
      "\006ImType\022\017\n\013ImHandShake\020\001\022\r\n\tImChClose\020\002\022" +
      "\023\n\017SysAnnouncement\020\003\022\013\n\007Danmaku\020\004\022\010\n\004Gif" +
      "t\020\005B!\n\030protobuf.generate.webappB\005ImPto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Im_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Im_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Im_descriptor,
        new String[] { "ImType", "Senderid", "Sendername", "Roomid", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
