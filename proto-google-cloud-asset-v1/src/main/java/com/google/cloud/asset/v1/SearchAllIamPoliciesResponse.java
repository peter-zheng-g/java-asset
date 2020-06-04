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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Search all IAM policies response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.SearchAllIamPoliciesResponse}
 */
public final class SearchAllIamPoliciesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.SearchAllIamPoliciesResponse)
    SearchAllIamPoliciesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchAllIamPoliciesResponse.newBuilder() to construct.
  private SearchAllIamPoliciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchAllIamPoliciesResponse() {
    results_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchAllIamPoliciesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SearchAllIamPoliciesResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                results_ =
                    new java.util.ArrayList<com.google.cloud.asset.v1.IamPolicySearchResult>();
                mutable_bitField0_ |= 0x00000001;
              }
              results_.add(
                  input.readMessage(
                      com.google.cloud.asset.v1.IamPolicySearchResult.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_SearchAllIamPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_SearchAllIamPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.class,
            com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.asset.v1.IamPolicySearchResult> results_;
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.asset.v1.IamPolicySearchResult> getResultsList() {
    return results_;
  }
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder>
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicySearchResult getResults(int index) {
    return results_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of IamPolicy that match the search query. Related information such
   * as the associated resource is returned along with the policy.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder getResultsOrBuilder(int index) {
    return results_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Set if there are more results than those appearing in this response; to get
   * the next set of results, call this method again, using this value as the
   * `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Set if there are more results than those appearing in this response; to get
   * the next set of results, call this method again, using this value as the
   * `page_token`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, results_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.SearchAllIamPoliciesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.SearchAllIamPoliciesResponse other =
        (com.google.cloud.asset.v1.SearchAllIamPoliciesResponse) obj;

    if (!getResultsList().equals(other.getResultsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.asset.v1.SearchAllIamPoliciesResponse prototype) {
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
   * Search all IAM policies response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.SearchAllIamPoliciesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.SearchAllIamPoliciesResponse)
      com.google.cloud.asset.v1.SearchAllIamPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_SearchAllIamPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_SearchAllIamPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.class,
              com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResultsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_SearchAllIamPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.SearchAllIamPoliciesResponse getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.SearchAllIamPoliciesResponse build() {
      com.google.cloud.asset.v1.SearchAllIamPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.SearchAllIamPoliciesResponse buildPartial() {
      com.google.cloud.asset.v1.SearchAllIamPoliciesResponse result =
          new com.google.cloud.asset.v1.SearchAllIamPoliciesResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.asset.v1.SearchAllIamPoliciesResponse) {
        return mergeFrom((com.google.cloud.asset.v1.SearchAllIamPoliciesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.SearchAllIamPoliciesResponse other) {
      if (other == com.google.cloud.asset.v1.SearchAllIamPoliciesResponse.getDefaultInstance())
        return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getResultsFieldBuilder()
                    : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.asset.v1.SearchAllIamPoliciesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.asset.v1.SearchAllIamPoliciesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.asset.v1.IamPolicySearchResult> results_ =
        java.util.Collections.emptyList();

    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ =
            new java.util.ArrayList<com.google.cloud.asset.v1.IamPolicySearchResult>(results_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.IamPolicySearchResult,
            com.google.cloud.asset.v1.IamPolicySearchResult.Builder,
            com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder>
        resultsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.IamPolicySearchResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public com.google.cloud.asset.v1.IamPolicySearchResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder setResults(int index, com.google.cloud.asset.v1.IamPolicySearchResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.cloud.asset.v1.IamPolicySearchResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder addResults(com.google.cloud.asset.v1.IamPolicySearchResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder addResults(int index, com.google.cloud.asset.v1.IamPolicySearchResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder addResults(
        com.google.cloud.asset.v1.IamPolicySearchResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.cloud.asset.v1.IamPolicySearchResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.cloud.asset.v1.IamPolicySearchResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public com.google.cloud.asset.v1.IamPolicySearchResult.Builder getResultsBuilder(int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder getResultsOrBuilder(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder>
        getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public com.google.cloud.asset.v1.IamPolicySearchResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder()
          .addBuilder(com.google.cloud.asset.v1.IamPolicySearchResult.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public com.google.cloud.asset.v1.IamPolicySearchResult.Builder addResultsBuilder(int index) {
      return getResultsFieldBuilder()
          .addBuilder(index, com.google.cloud.asset.v1.IamPolicySearchResult.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of IamPolicy that match the search query. Related information such
     * as the associated resource is returned along with the policy.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.IamPolicySearchResult results = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.IamPolicySearchResult.Builder>
        getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.IamPolicySearchResult,
            com.google.cloud.asset.v1.IamPolicySearchResult.Builder,
            com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder>
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.asset.v1.IamPolicySearchResult,
                com.google.cloud.asset.v1.IamPolicySearchResult.Builder,
                com.google.cloud.asset.v1.IamPolicySearchResultOrBuilder>(
                results_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Set if there are more results than those appearing in this response; to get
     * the next set of results, call this method again, using this value as the
     * `page_token`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Set if there are more results than those appearing in this response; to get
     * the next set of results, call this method again, using this value as the
     * `page_token`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Set if there are more results than those appearing in this response; to get
     * the next set of results, call this method again, using this value as the
     * `page_token`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set if there are more results than those appearing in this response; to get
     * the next set of results, call this method again, using this value as the
     * `page_token`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set if there are more results than those appearing in this response; to get
     * the next set of results, call this method again, using this value as the
     * `page_token`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.SearchAllIamPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.SearchAllIamPoliciesResponse)
  private static final com.google.cloud.asset.v1.SearchAllIamPoliciesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.SearchAllIamPoliciesResponse();
  }

  public static com.google.cloud.asset.v1.SearchAllIamPoliciesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchAllIamPoliciesResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchAllIamPoliciesResponse>() {
        @java.lang.Override
        public SearchAllIamPoliciesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SearchAllIamPoliciesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SearchAllIamPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchAllIamPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.SearchAllIamPoliciesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
