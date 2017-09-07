// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Demo.proto

package com.redteamobile.matrix.pb;

/**
 * <pre>
 * Gaga service provider
 * </pre>
 *
 * Protobuf service {@code GagaProvider}
 */
public  abstract class GagaProvider
    implements com.google.protobuf.Service {
  protected GagaProvider() {}

  public interface Interface {
    /**
     * <code>rpc ListBundle(.Request2ListBundle) returns (.Reply2ListBundle);</code>
     */
    public abstract void listBundle(
        com.google.protobuf.RpcController controller,
        com.redteamobile.matrix.pb.Request2ListBundle request,
        com.google.protobuf.RpcCallback<com.redteamobile.matrix.pb.Reply2ListBundle> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new GagaProvider() {
      @java.lang.Override
      public  void listBundle(
          com.google.protobuf.RpcController controller,
          com.redteamobile.matrix.pb.Request2ListBundle request,
          com.google.protobuf.RpcCallback<com.redteamobile.matrix.pb.Reply2ListBundle> done) {
        impl.listBundle(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.listBundle(controller, (com.redteamobile.matrix.pb.Request2ListBundle)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.redteamobile.matrix.pb.Request2ListBundle.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.redteamobile.matrix.pb.Reply2ListBundle.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc ListBundle(.Request2ListBundle) returns (.Reply2ListBundle);</code>
   */
  public abstract void listBundle(
      com.google.protobuf.RpcController controller,
      com.redteamobile.matrix.pb.Request2ListBundle request,
      com.google.protobuf.RpcCallback<com.redteamobile.matrix.pb.Reply2ListBundle> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.redteamobile.matrix.pb.Demo.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.listBundle(controller, (com.redteamobile.matrix.pb.Request2ListBundle)request,
          com.google.protobuf.RpcUtil.<com.redteamobile.matrix.pb.Reply2ListBundle>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.redteamobile.matrix.pb.Request2ListBundle.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.redteamobile.matrix.pb.Reply2ListBundle.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.redteamobile.matrix.pb.GagaProvider implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void listBundle(
        com.google.protobuf.RpcController controller,
        com.redteamobile.matrix.pb.Request2ListBundle request,
        com.google.protobuf.RpcCallback<com.redteamobile.matrix.pb.Reply2ListBundle> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.redteamobile.matrix.pb.Reply2ListBundle.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.redteamobile.matrix.pb.Reply2ListBundle.class,
          com.redteamobile.matrix.pb.Reply2ListBundle.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.redteamobile.matrix.pb.Reply2ListBundle listBundle(
        com.google.protobuf.RpcController controller,
        com.redteamobile.matrix.pb.Request2ListBundle request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.redteamobile.matrix.pb.Reply2ListBundle listBundle(
        com.google.protobuf.RpcController controller,
        com.redteamobile.matrix.pb.Request2ListBundle request)
        throws com.google.protobuf.ServiceException {
      return (com.redteamobile.matrix.pb.Reply2ListBundle) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.redteamobile.matrix.pb.Reply2ListBundle.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:GagaProvider)
}
