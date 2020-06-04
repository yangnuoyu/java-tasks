/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/queue.proto

package com.google.cloud.tasks.v2;

/**
 *
 *
 * <pre>
 * Configuration options for writing logs to
 * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2.StackdriverLoggingConfig}
 */
public final class StackdriverLoggingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2.StackdriverLoggingConfig)
    StackdriverLoggingConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StackdriverLoggingConfig.newBuilder() to construct.
  private StackdriverLoggingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StackdriverLoggingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StackdriverLoggingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StackdriverLoggingConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 9:
            {
              samplingRatio_ = input.readDouble();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2.QueueProto
        .internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2.QueueProto
        .internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2.StackdriverLoggingConfig.class,
            com.google.cloud.tasks.v2.StackdriverLoggingConfig.Builder.class);
  }

  public static final int SAMPLING_RATIO_FIELD_NUMBER = 1;
  private double samplingRatio_;
  /**
   *
   *
   * <pre>
   * Specifies the fraction of operations to write to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
   * This field may contain any value between 0.0 and 1.0, inclusive.
   * 0.0 is the default and means that no operations are logged.
   * </pre>
   *
   * <code>double sampling_ratio = 1;</code>
   *
   * @return The samplingRatio.
   */
  @java.lang.Override
  public double getSamplingRatio() {
    return samplingRatio_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (samplingRatio_ != 0D) {
      output.writeDouble(1, samplingRatio_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (samplingRatio_ != 0D) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, samplingRatio_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2.StackdriverLoggingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2.StackdriverLoggingConfig other =
        (com.google.cloud.tasks.v2.StackdriverLoggingConfig) obj;

    if (java.lang.Double.doubleToLongBits(getSamplingRatio())
        != java.lang.Double.doubleToLongBits(other.getSamplingRatio())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SAMPLING_RATIO_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getSamplingRatio()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.tasks.v2.StackdriverLoggingConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Configuration options for writing logs to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2.StackdriverLoggingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2.StackdriverLoggingConfig)
      com.google.cloud.tasks.v2.StackdriverLoggingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2.QueueProto
          .internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2.QueueProto
          .internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2.StackdriverLoggingConfig.class,
              com.google.cloud.tasks.v2.StackdriverLoggingConfig.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2.StackdriverLoggingConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      samplingRatio_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2.QueueProto
          .internal_static_google_cloud_tasks_v2_StackdriverLoggingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2.StackdriverLoggingConfig getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2.StackdriverLoggingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2.StackdriverLoggingConfig build() {
      com.google.cloud.tasks.v2.StackdriverLoggingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2.StackdriverLoggingConfig buildPartial() {
      com.google.cloud.tasks.v2.StackdriverLoggingConfig result =
          new com.google.cloud.tasks.v2.StackdriverLoggingConfig(this);
      result.samplingRatio_ = samplingRatio_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tasks.v2.StackdriverLoggingConfig) {
        return mergeFrom((com.google.cloud.tasks.v2.StackdriverLoggingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2.StackdriverLoggingConfig other) {
      if (other == com.google.cloud.tasks.v2.StackdriverLoggingConfig.getDefaultInstance())
        return this;
      if (other.getSamplingRatio() != 0D) {
        setSamplingRatio(other.getSamplingRatio());
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
      com.google.cloud.tasks.v2.StackdriverLoggingConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.tasks.v2.StackdriverLoggingConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double samplingRatio_;
    /**
     *
     *
     * <pre>
     * Specifies the fraction of operations to write to
     * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
     * This field may contain any value between 0.0 and 1.0, inclusive.
     * 0.0 is the default and means that no operations are logged.
     * </pre>
     *
     * <code>double sampling_ratio = 1;</code>
     *
     * @return The samplingRatio.
     */
    @java.lang.Override
    public double getSamplingRatio() {
      return samplingRatio_;
    }
    /**
     *
     *
     * <pre>
     * Specifies the fraction of operations to write to
     * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
     * This field may contain any value between 0.0 and 1.0, inclusive.
     * 0.0 is the default and means that no operations are logged.
     * </pre>
     *
     * <code>double sampling_ratio = 1;</code>
     *
     * @param value The samplingRatio to set.
     * @return This builder for chaining.
     */
    public Builder setSamplingRatio(double value) {

      samplingRatio_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the fraction of operations to write to
     * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
     * This field may contain any value between 0.0 and 1.0, inclusive.
     * 0.0 is the default and means that no operations are logged.
     * </pre>
     *
     * <code>double sampling_ratio = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSamplingRatio() {

      samplingRatio_ = 0D;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2.StackdriverLoggingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2.StackdriverLoggingConfig)
  private static final com.google.cloud.tasks.v2.StackdriverLoggingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2.StackdriverLoggingConfig();
  }

  public static com.google.cloud.tasks.v2.StackdriverLoggingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StackdriverLoggingConfig> PARSER =
      new com.google.protobuf.AbstractParser<StackdriverLoggingConfig>() {
        @java.lang.Override
        public StackdriverLoggingConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StackdriverLoggingConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StackdriverLoggingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StackdriverLoggingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2.StackdriverLoggingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
