// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

object ScalapbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      scalapb.options.ScalaPbOptions,
      scalapb.options.MessageOptions,
      scalapb.options.Collection,
      scalapb.options.FieldOptions,
      scalapb.options.EnumOptions,
      scalapb.options.EnumValueOptions,
      scalapb.options.OneofOptions,
      scalapb.options.FieldTransformation,
      scalapb.options.PreprocessorOutput
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChVzY2FsYXBiL3NjYWxhcGIucHJvdG8SB3NjYWxhcGIaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIs0UCg5TY
  2FsYVBiT3B0aW9ucxIzCgxwYWNrYWdlX25hbWUYASABKAlCEOI/DRILcGFja2FnZU5hbWVSC3BhY2thZ2VOYW1lEjMKDGZsYXRfc
  GFja2FnZRgCIAEoCEIQ4j8NEgtmbGF0UGFja2FnZVILZmxhdFBhY2thZ2USIwoGaW1wb3J0GAMgAygJQgviPwgSBmltcG9ydFIGa
  W1wb3J0EikKCHByZWFtYmxlGAQgAygJQg3iPwoSCHByZWFtYmxlUghwcmVhbWJsZRIwCgtzaW5nbGVfZmlsZRgFIAEoCEIP4j8ME
  gpzaW5nbGVGaWxlUgpzaW5nbGVGaWxlEkwKFW5vX3ByaW1pdGl2ZV93cmFwcGVycxgHIAEoCEIY4j8VEhNub1ByaW1pdGl2ZVdyY
  XBwZXJzUhNub1ByaW1pdGl2ZVdyYXBwZXJzEkUKEnByaW1pdGl2ZV93cmFwcGVycxgGIAEoCEIW4j8TEhFwcmltaXRpdmVXcmFwc
  GVyc1IRcHJpbWl0aXZlV3JhcHBlcnMSPAoPY29sbGVjdGlvbl90eXBlGAggASgJQhPiPxASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZ
  WN0aW9uVHlwZRJYChdwcmVzZXJ2ZV91bmtub3duX2ZpZWxkcxgJIAEoCDoEdHJ1ZUIa4j8XEhVwcmVzZXJ2ZVVua25vd25GaWVsZ
  HNSFXByZXNlcnZlVW5rbm93bkZpZWxkcxIwCgtvYmplY3RfbmFtZRgKIAEoCUIP4j8MEgpvYmplY3ROYW1lUgpvYmplY3ROYW1lE
  kYKBXNjb3BlGAsgASgOMiQuc2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5PcHRpb25zU2NvcGVCCuI/BxIFc2NvcGVSBXNjb3BlEikKB
  mxlbnNlcxgMIAEoCDoEdHJ1ZUIL4j8IEgZsZW5zZXNSBmxlbnNlcxJQChdyZXRhaW5fc291cmNlX2NvZGVfaW5mbxgNIAEoCEIZ4
  j8WEhRyZXRhaW5Tb3VyY2VDb2RlSW5mb1IUcmV0YWluU291cmNlQ29kZUluZm8SJwoIbWFwX3R5cGUYDiABKAlCDOI/CRIHbWFwV
  HlwZVIHbWFwVHlwZRJpCiBub19kZWZhdWx0X3ZhbHVlc19pbl9jb25zdHJ1Y3RvchgPIAEoCEIh4j8eEhxub0RlZmF1bHRWYWx1Z
  XNJbkNvbnN0cnVjdG9yUhxub0RlZmF1bHRWYWx1ZXNJbkNvbnN0cnVjdG9yEmkKEWVudW1fdmFsdWVfbmFtaW5nGBAgASgOMicuc
  2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5FbnVtVmFsdWVOYW1pbmdCFOI/ERIPZW51bVZhbHVlTmFtaW5nUg9lbnVtVmFsdWVOYW1pb
  mcSRwoRZW51bV9zdHJpcF9wcmVmaXgYESABKAg6BWZhbHNlQhTiPxESD2VudW1TdHJpcFByZWZpeFIPZW51bVN0cmlwUHJlZml4E
  i0KCmJ5dGVzX3R5cGUYFSABKAlCDuI/CxIJYnl0ZXNUeXBlUglieXRlc1R5cGUSPwoQamF2YV9jb252ZXJzaW9ucxgXIAEoCEIU4
  j8REg9qYXZhQ29udmVyc2lvbnNSD2phdmFDb252ZXJzaW9ucxJxChNhdXhfbWVzc2FnZV9vcHRpb25zGBIgAygLMikuc2NhbGFwY
  i5TY2FsYVBiT3B0aW9ucy5BdXhNZXNzYWdlT3B0aW9uc0IW4j8TEhFhdXhNZXNzYWdlT3B0aW9uc1IRYXV4TWVzc2FnZU9wdGlvb
  nMSaQoRYXV4X2ZpZWxkX29wdGlvbnMYEyADKAsyJy5zY2FsYXBiLlNjYWxhUGJPcHRpb25zLkF1eEZpZWxkT3B0aW9uc0IU4j8RE
  g9hdXhGaWVsZE9wdGlvbnNSD2F1eEZpZWxkT3B0aW9ucxJlChBhdXhfZW51bV9vcHRpb25zGBQgAygLMiYuc2NhbGFwYi5TY2FsY
  VBiT3B0aW9ucy5BdXhFbnVtT3B0aW9uc0IT4j8QEg5hdXhFbnVtT3B0aW9uc1IOYXV4RW51bU9wdGlvbnMSegoWYXV4X2VudW1fd
  mFsdWVfb3B0aW9ucxgWIAMoCzIrLnNjYWxhcGIuU2NhbGFQYk9wdGlvbnMuQXV4RW51bVZhbHVlT3B0aW9uc0IY4j8VEhNhdXhFb
  nVtVmFsdWVPcHRpb25zUhNhdXhFbnVtVmFsdWVPcHRpb25zEjgKDXByZXByb2Nlc3NvcnMYGCADKAlCEuI/DxINcHJlcHJvY2Vzc
  29yc1INcHJlcHJvY2Vzc29ycxJsChVmaWVsZF90cmFuc2Zvcm1hdGlvbnMYGSADKAsyHC5zY2FsYXBiLkZpZWxkVHJhbnNmb3JtY
  XRpb25CGeI/FhIUZmllbGRUcmFuc2Zvcm1hdGlvbnNSFGZpZWxkVHJhbnNmb3JtYXRpb25zElsKGmlnbm9yZV9hbGxfdHJhbnNmb
  3JtYXRpb25zGBogASgIQh3iPxoSGGlnbm9yZUFsbFRyYW5zZm9ybWF0aW9uc1IYaWdub3JlQWxsVHJhbnNmb3JtYXRpb25zEmEKH
  XRlc3Rfb25seV9ub19qYXZhX2NvbnZlcnNpb25zGOcHIAEoCEIe4j8bEhl0ZXN0T25seU5vSmF2YUNvbnZlcnNpb25zUhl0ZXN0T
  25seU5vSmF2YUNvbnZlcnNpb25zGnkKEUF1eE1lc3NhZ2VPcHRpb25zEiMKBnRhcmdldBgBIAEoCUIL4j8IEgZ0YXJnZXRSBnRhc
  mdldBI/CgdvcHRpb25zGAIgASgLMhcuc2NhbGFwYi5NZXNzYWdlT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvcHRpb25zGnUKD0F1e
  EZpZWxkT3B0aW9ucxIjCgZ0YXJnZXQYASABKAlCC+I/CBIGdGFyZ2V0UgZ0YXJnZXQSPQoHb3B0aW9ucxgCIAEoCzIVLnNjYWxhc
  GIuRmllbGRPcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMacwoOQXV4RW51bU9wdGlvbnMSIwoGdGFyZ2V0GAEgASgJQgviP
  wgSBnRhcmdldFIGdGFyZ2V0EjwKB29wdGlvbnMYAiABKAsyFC5zY2FsYXBiLkVudW1PcHRpb25zQgziPwkSB29wdGlvbnNSB29wd
  GlvbnMafQoTQXV4RW51bVZhbHVlT3B0aW9ucxIjCgZ0YXJnZXQYASABKAlCC+I/CBIGdGFyZ2V0UgZ0YXJnZXQSQQoHb3B0aW9uc
  xgCIAEoCzIZLnNjYWxhcGIuRW51bVZhbHVlT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvcHRpb25zIiUKDE9wdGlvbnNTY29wZRIIC
  gRGSUxFEAASCwoHUEFDS0FHRRABIjIKD0VudW1WYWx1ZU5hbWluZxIPCgtBU19JTl9QUk9UTxAAEg4KCkNBTUVMX0NBU0UQASoJC
  OgHEICAgIACIvUDCg5NZXNzYWdlT3B0aW9ucxImCgdleHRlbmRzGAEgAygJQgziPwkSB2V4dGVuZHNSB2V4dGVuZHMSQgoRY29tc
  GFuaW9uX2V4dGVuZHMYAiADKAlCFeI/EhIQY29tcGFuaW9uRXh0ZW5kc1IQY29tcGFuaW9uRXh0ZW5kcxIyCgthbm5vdGF0aW9uc
  xgDIAMoCUIQ4j8NEgthbm5vdGF0aW9uc1ILYW5ub3RhdGlvbnMSHQoEdHlwZRgEIAEoCUIJ4j8GEgR0eXBlUgR0eXBlEk4KFWNvb
  XBhbmlvbl9hbm5vdGF0aW9ucxgFIAMoCUIZ4j8WEhRjb21wYW5pb25Bbm5vdGF0aW9uc1IUY29tcGFuaW9uQW5ub3RhdGlvbnMSS
  QoUc2VhbGVkX29uZW9mX2V4dGVuZHMYBiADKAlCF+I/FBISc2VhbGVkT25lb2ZFeHRlbmRzUhJzZWFsZWRPbmVvZkV4dGVuZHMSI
  QoGbm9fYm94GAcgASgIQgriPwcSBW5vQm94UgVub0JveBJbChp1bmtub3duX2ZpZWxkc19hbm5vdGF0aW9ucxgIIAMoCUId4j8aE
  hh1bmtub3duRmllbGRzQW5ub3RhdGlvbnNSGHVua25vd25GaWVsZHNBbm5vdGF0aW9ucyoJCOgHEICAgIACIn8KCkNvbGxlY3Rpb
  24SHQoEdHlwZRgBIAEoCUIJ4j8GEgR0eXBlUgR0eXBlEioKCW5vbl9lbXB0eRgCIAEoCEIN4j8KEghub25FbXB0eVIIbm9uRW1wd
  HkSJgoHYWRhcHRlchgDIAEoCUIM4j8JEgdhZGFwdGVyUgdhZGFwdGVyIu4DCgxGaWVsZE9wdGlvbnMSHQoEdHlwZRgBIAEoCUIJ4
  j8GEgR0eXBlUgR0eXBlEi0KCnNjYWxhX25hbWUYAiABKAlCDuI/CxIJc2NhbGFOYW1lUglzY2FsYU5hbWUSPAoPY29sbGVjdGlvb
  l90eXBlGAMgASgJQhPiPxASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZWN0aW9uVHlwZRJECgpjb2xsZWN0aW9uGAggASgLMhMuc2Nhb
  GFwYi5Db2xsZWN0aW9uQg/iPwwSCmNvbGxlY3Rpb25SCmNvbGxlY3Rpb24SJwoIa2V5X3R5cGUYBCABKAlCDOI/CRIHa2V5VHlwZ
  VIHa2V5VHlwZRItCgp2YWx1ZV90eXBlGAUgASgJQg7iPwsSCXZhbHVlVHlwZVIJdmFsdWVUeXBlEjIKC2Fubm90YXRpb25zGAYgA
  ygJQhDiPw0SC2Fubm90YXRpb25zUgthbm5vdGF0aW9ucxInCghtYXBfdHlwZRgHIAEoCUIM4j8JEgdtYXBUeXBlUgdtYXBUeXBlE
  iEKBm5vX2JveBgeIAEoCEIK4j8HEgVub0JveFIFbm9Cb3gSKQoIcmVxdWlyZWQYHyABKAhCDeI/ChIIcmVxdWlyZWRSCHJlcXVpc
  mVkKgkI6AcQgICAgAIiowEKC0VudW1PcHRpb25zEiYKB2V4dGVuZHMYASADKAlCDOI/CRIHZXh0ZW5kc1IHZXh0ZW5kcxJCChFjb
  21wYW5pb25fZXh0ZW5kcxgCIAMoCUIV4j8SEhBjb21wYW5pb25FeHRlbmRzUhBjb21wYW5pb25FeHRlbmRzEh0KBHR5cGUYAyABK
  AlCCeI/BhIEdHlwZVIEdHlwZSoJCOgHEICAgIACInQKEEVudW1WYWx1ZU9wdGlvbnMSJgoHZXh0ZW5kcxgBIAMoCUIM4j8JEgdle
  HRlbmRzUgdleHRlbmRzEi0KCnNjYWxhX25hbWUYAiABKAlCDuI/CxIJc2NhbGFOYW1lUglzY2FsYU5hbWUqCQjoBxCAgICAAiJwC
  gxPbmVvZk9wdGlvbnMSJgoHZXh0ZW5kcxgBIAMoCUIM4j8JEgdleHRlbmRzUgdleHRlbmRzEi0KCnNjYWxhX25hbWUYAiABKAlCD
  uI/CxIJc2NhbGFOYW1lUglzY2FsYU5hbWUqCQjoBxCAgICAAiKbAgoTRmllbGRUcmFuc2Zvcm1hdGlvbhI8CgR3aGVuGAEgASgLM
  h0uZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9uc0IJ4j8GEgR3aGVuUgR3aGVuEl8KCm1hdGNoX3R5cGUYAiABKA4yJi5zY2FsY
  XBiLkZpZWxkVHJhbnNmb3JtYXRpb24uTWF0Y2hUeXBlOghDT05UQUlOU0IO4j8LEgltYXRjaFR5cGVSCW1hdGNoVHlwZRIxCgNzZ
  XQYAyABKAsyFS5zY2FsYXBiLkZpZWxkT3B0aW9uc0II4j8FEgNzZXRSA3NldCIyCglNYXRjaFR5cGUSDAoIQ09OVEFJTlMQABIJC
  gVFWEFDVBABEgwKCFBSRVNFTkNFEAIi8QEKElByZXByb2Nlc3Nvck91dHB1dBJqCg9vcHRpb25zX2J5X2ZpbGUYASADKAsyLi5zY
  2FsYXBiLlByZXByb2Nlc3Nvck91dHB1dC5PcHRpb25zQnlGaWxlRW50cnlCEuI/DxINb3B0aW9uc0J5RmlsZVINb3B0aW9uc0J5R
  mlsZRpvChJPcHRpb25zQnlGaWxlRW50cnkSGgoDa2V5GAEgASgJQgjiPwUSA2tleVIDa2V5EjkKBXZhbHVlGAIgASgLMhcuc2Nhb
  GFwYi5TY2FsYVBiT3B0aW9uc0IK4j8HEgV2YWx1ZVIFdmFsdWU6AjgBOlAKB29wdGlvbnMSHC5nb29nbGUucHJvdG9idWYuRmlsZ
  U9wdGlvbnMY/AcgASgLMhcuc2NhbGFwYi5TY2FsYVBiT3B0aW9uc1IHb3B0aW9uczpTCgdtZXNzYWdlEh8uZ29vZ2xlLnByb3RvY
  nVmLk1lc3NhZ2VPcHRpb25zGPwHIAEoCzIXLnNjYWxhcGIuTWVzc2FnZU9wdGlvbnNSB21lc3NhZ2U6SwoFZmllbGQSHS5nb29nb
  GUucHJvdG9idWYuRmllbGRPcHRpb25zGPwHIAEoCzIVLnNjYWxhcGIuRmllbGRPcHRpb25zUgVmaWVsZDpWCgxlbnVtX29wdGlvb
  nMSHC5nb29nbGUucHJvdG9idWYuRW51bU9wdGlvbnMY/AcgASgLMhQuc2NhbGFwYi5FbnVtT3B0aW9uc1ILZW51bU9wdGlvbnM6X
  AoKZW51bV92YWx1ZRIhLmdvb2dsZS5wcm90b2J1Zi5FbnVtVmFsdWVPcHRpb25zGPwHIAEoCzIZLnNjYWxhcGIuRW51bVZhbHVlT
  3B0aW9uc1IJZW51bVZhbHVlOksKBW9uZW9mEh0uZ29vZ2xlLnByb3RvYnVmLk9uZW9mT3B0aW9ucxj8ByABKAsyFS5zY2FsYXBiL
  k9uZW9mT3B0aW9uc1IFb25lb2ZCJwoPc2NhbGFwYi5vcHRpb25z4j8TCg9zY2FsYXBiLm9wdGlvbnMQAQ=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val options: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, _root_.scala.Option[scalapb.options.ScalaPbOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.ScalaPbOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val message: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MessageOptions, _root_.scala.Option[scalapb.options.MessageOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.MessageOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val field: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, _root_.scala.Option[scalapb.options.FieldOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumOptions: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumOptions, _root_.scala.Option[scalapb.options.EnumOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumValue: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumValueOptions, _root_.scala.Option[scalapb.options.EnumValueOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumValueOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val oneof: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.OneofOptions, _root_.scala.Option[scalapb.options.OneofOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.OneofOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}