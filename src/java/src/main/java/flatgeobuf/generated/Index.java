// automatically generated by the FlatBuffers compiler, do not modify

package flatgeobuf.generated;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Index extends Table {
  public static Index getRootAsIndex(ByteBuffer _bb) { return getRootAsIndex(_bb, new Index()); }
  public static Index getRootAsIndex(ByteBuffer _bb, Index obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Index __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int nodeSize() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 16; }
  public int offsetSize() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 4; }

  public static int createIndex(FlatBufferBuilder builder,
      int node_size,
      int offset_size) {
    builder.startObject(2);
    Index.addNodeSize(builder, node_size);
    Index.addOffsetSize(builder, offset_size);
    return Index.endIndex(builder);
  }

  public static void startIndex(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addNodeSize(FlatBufferBuilder builder, int nodeSize) { builder.addShort(0, (short)nodeSize, (short)16); }
  public static void addOffsetSize(FlatBufferBuilder builder, int offsetSize) { builder.addByte(1, (byte)offsetSize, (byte)4); }
  public static int endIndex(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

