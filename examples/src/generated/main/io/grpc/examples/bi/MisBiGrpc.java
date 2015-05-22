package io.grpc.examples.bi;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class MisBiGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.bi.BiLog,
      io.grpc.examples.bi.BiResult> METHOD_BI =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "Bi",
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.bi.BiLog.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.bi.BiResult.PARSER));

  public static MisBiStub newStub(io.grpc.Channel channel) {
    return new MisBiStub(channel, CONFIG);
  }

  public static MisBiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MisBiBlockingStub(channel, CONFIG);
  }

  public static MisBiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MisBiFutureStub(channel, CONFIG);
  }

  public static final MisBiServiceDescriptor CONFIG =
      new MisBiServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class MisBiServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<MisBiServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.bi.BiLog,
        io.grpc.examples.bi.BiResult> bi;

    private MisBiServiceDescriptor() {
      bi = createMethodDescriptor(
          "p.MisBi", METHOD_BI);
    }

    @SuppressWarnings("unchecked")
    private MisBiServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      bi = (io.grpc.MethodDescriptor<io.grpc.examples.bi.BiLog,
          io.grpc.examples.bi.BiResult>) methodMap.get(
          CONFIG.bi.getName());
    }

    @java.lang.Override
    protected MisBiServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new MisBiServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          bi);
    }
  }

  public static interface MisBi {

    public void bi(io.grpc.examples.bi.BiLog request,
        io.grpc.stub.StreamObserver<io.grpc.examples.bi.BiResult> responseObserver);
  }

  public static interface MisBiBlockingClient {

    public io.grpc.examples.bi.BiResult bi(io.grpc.examples.bi.BiLog request);
  }

  public static interface MisBiFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.bi.BiResult> bi(
        io.grpc.examples.bi.BiLog request);
  }

  public static class MisBiStub extends
      io.grpc.stub.AbstractStub<MisBiStub, MisBiServiceDescriptor>
      implements MisBi {
    private MisBiStub(io.grpc.Channel channel,
        MisBiServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected MisBiStub build(io.grpc.Channel channel,
        MisBiServiceDescriptor config) {
      return new MisBiStub(channel, config);
    }

    @java.lang.Override
    public void bi(io.grpc.examples.bi.BiLog request,
        io.grpc.stub.StreamObserver<io.grpc.examples.bi.BiResult> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.bi), request, responseObserver);
    }
  }

  public static class MisBiBlockingStub extends
      io.grpc.stub.AbstractStub<MisBiBlockingStub, MisBiServiceDescriptor>
      implements MisBiBlockingClient {
    private MisBiBlockingStub(io.grpc.Channel channel,
        MisBiServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected MisBiBlockingStub build(io.grpc.Channel channel,
        MisBiServiceDescriptor config) {
      return new MisBiBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.bi.BiResult bi(io.grpc.examples.bi.BiLog request) {
      return blockingUnaryCall(
          channel.newCall(config.bi), request);
    }
  }

  public static class MisBiFutureStub extends
      io.grpc.stub.AbstractStub<MisBiFutureStub, MisBiServiceDescriptor>
      implements MisBiFutureClient {
    private MisBiFutureStub(io.grpc.Channel channel,
        MisBiServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected MisBiFutureStub build(io.grpc.Channel channel,
        MisBiServiceDescriptor config) {
      return new MisBiFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.bi.BiResult> bi(
        io.grpc.examples.bi.BiLog request) {
      return unaryFutureCall(
          channel.newCall(config.bi), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final MisBi serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("p.MisBi")
      .addMethod(createMethodDefinition(
          METHOD_BI,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.bi.BiLog,
                io.grpc.examples.bi.BiResult>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.bi.BiLog request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.bi.BiResult> responseObserver) {
                serviceImpl.bi(request, responseObserver);
              }
            }))).build();
  }
}
