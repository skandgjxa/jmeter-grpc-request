// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: segment.proto

package generated.xn.services.ex.api.grpcstream.protos;

public final class SegmentProtos {
  private SegmentProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_services_seg_SegmentReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_services_seg_SegmentReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_services_seg_SegmentResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_services_seg_SegmentResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rsegment.proto\022\021data_services_seg\"W\n\nSe" +
      "gmentReq\022\n\n\002id\030\001 \001(\t\022\017\n\007segment\030\002 \001(\005\022\013\n" +
      "\003mac\030\003 \001(\t\022\016\n\006client\030\004 \001(\005\022\017\n\007reqdate\030\005 " +
      "\001(\003\"\035\n\013SegmentResp\022\016\n\006result\030\001 \001(\t2^\n\017Se" +
      "gmentServices\022K\n\010checkSeg\022\035.data_service" +
      "s_seg.SegmentReq\032\036.data_services_seg.Seg" +
      "mentResp\"\000BA\n.generated.xn.services.ex.a" +
      "pi.grpcstream.protosB\rSegmentProtosP\001b\006p" +
      "roto3"
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
    internal_static_data_services_seg_SegmentReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_services_seg_SegmentReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_services_seg_SegmentReq_descriptor,
        new java.lang.String[] { "Id", "Segment", "Mac", "Client", "Reqdate", });
    internal_static_data_services_seg_SegmentResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_data_services_seg_SegmentResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_services_seg_SegmentResp_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
