// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/testing/integration/test.proto

package io.grpc.testing.integration;

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&io/grpc/testing/integration/test.proto" +
      "\022\014grpc.testing\032\'io/grpc/testing/integrat" +
      "ion/empty.proto\032*io/grpc/testing/integra" +
      "tion/messages.proto2\273\004\n\013TestService\0225\n\tE" +
      "mptyCall\022\023.grpc.testing.Empty\032\023.grpc.tes" +
      "ting.Empty\022F\n\tUnaryCall\022\033.grpc.testing.S" +
      "impleRequest\032\034.grpc.testing.SimpleRespon" +
      "se\022l\n\023StreamingOutputCall\022(.grpc.testing" +
      ".StreamingOutputCallRequest\032).grpc.testi" +
      "ng.StreamingOutputCallResponse0\001\022i\n\022Stre",
      "amingInputCall\022\'.grpc.testing.StreamingI" +
      "nputCallRequest\032(.grpc.testing.Streaming" +
      "InputCallResponse(\001\022i\n\016FullDuplexCall\022(." +
      "grpc.testing.StreamingOutputCallRequest\032" +
      ").grpc.testing.StreamingOutputCallRespon" +
      "se(\0010\001\022i\n\016HalfDuplexCall\022(.grpc.testing." +
      "StreamingOutputCallRequest\032).grpc.testin" +
      "g.StreamingOutputCallResponse(\0010\001B\035\n\033io." +
      "grpc.testing.integrationb\006proto3"
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
          com.google.protobuf.EmptyProtos.getDescriptor(),
          io.grpc.testing.integration.Messages.getDescriptor(),
        }, assigner);
    com.google.protobuf.EmptyProtos.getDescriptor();
    io.grpc.testing.integration.Messages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
