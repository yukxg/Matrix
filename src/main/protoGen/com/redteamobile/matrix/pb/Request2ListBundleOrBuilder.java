// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Demo.proto

package com.redteamobile.matrix.pb;

public interface Request2ListBundleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Request2ListBundle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string merchant_code = 1;</code>
   */
  java.lang.String getMerchantCode();
  /**
   * <code>optional string merchant_code = 1;</code>
   */
  com.google.protobuf.ByteString
      getMerchantCodeBytes();

  /**
   * <code>optional .BundleDetail.BundleStatus status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .BundleDetail.BundleStatus status = 2;</code>
   */
  com.redteamobile.matrix.pb.BundleDetail.BundleStatus getStatus();

  /**
   * <code>optional int32 type = 3;</code>
   */
  int getType();
}
