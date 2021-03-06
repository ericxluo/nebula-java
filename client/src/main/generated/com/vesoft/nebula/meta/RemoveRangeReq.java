/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class RemoveRangeReq implements TBase, java.io.Serializable, Cloneable, Comparable<RemoveRangeReq> {
  private static final TStruct STRUCT_DESC = new TStruct("RemoveRangeReq");
  private static final TField SEGMENT_FIELD_DESC = new TField("segment", TType.STRING, (short)1);
  private static final TField START_FIELD_DESC = new TField("start", TType.STRING, (short)2);
  private static final TField END_FIELD_DESC = new TField("end", TType.STRING, (short)3);

  public byte[] segment;
  public byte[] start;
  public byte[] end;
  public static final int SEGMENT = 1;
  public static final int START = 2;
  public static final int END = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SEGMENT, new FieldMetaData("segment", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(START, new FieldMetaData("start", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(END, new FieldMetaData("end", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(RemoveRangeReq.class, metaDataMap);
  }

  public RemoveRangeReq() {
  }

  public RemoveRangeReq(
    byte[] segment,
    byte[] start,
    byte[] end)
  {
    this();
    this.segment = segment;
    this.start = start;
    this.end = end;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoveRangeReq(RemoveRangeReq other) {
    if (other.isSetSegment()) {
      this.segment = TBaseHelper.deepCopy(other.segment);
    }
    if (other.isSetStart()) {
      this.start = TBaseHelper.deepCopy(other.start);
    }
    if (other.isSetEnd()) {
      this.end = TBaseHelper.deepCopy(other.end);
    }
  }

  public RemoveRangeReq deepCopy() {
    return new RemoveRangeReq(this);
  }

  @Deprecated
  public RemoveRangeReq clone() {
    return new RemoveRangeReq(this);
  }

  public byte[]  getSegment() {
    return this.segment;
  }

  public RemoveRangeReq setSegment(byte[] segment) {
    this.segment = segment;
    return this;
  }

  public void unsetSegment() {
    this.segment = null;
  }

  // Returns true if field segment is set (has been assigned a value) and false otherwise
  public boolean isSetSegment() {
    return this.segment != null;
  }

  public void setSegmentIsSet(boolean value) {
    if (!value) {
      this.segment = null;
    }
  }

  public byte[]  getStart() {
    return this.start;
  }

  public RemoveRangeReq setStart(byte[] start) {
    this.start = start;
    return this;
  }

  public void unsetStart() {
    this.start = null;
  }

  // Returns true if field start is set (has been assigned a value) and false otherwise
  public boolean isSetStart() {
    return this.start != null;
  }

  public void setStartIsSet(boolean value) {
    if (!value) {
      this.start = null;
    }
  }

  public byte[]  getEnd() {
    return this.end;
  }

  public RemoveRangeReq setEnd(byte[] end) {
    this.end = end;
    return this;
  }

  public void unsetEnd() {
    this.end = null;
  }

  // Returns true if field end is set (has been assigned a value) and false otherwise
  public boolean isSetEnd() {
    return this.end != null;
  }

  public void setEndIsSet(boolean value) {
    if (!value) {
      this.end = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SEGMENT:
      if (value == null) {
        unsetSegment();
      } else {
        setSegment((byte[])value);
      }
      break;

    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((byte[])value);
      }
      break;

    case END:
      if (value == null) {
        unsetEnd();
      } else {
        setEnd((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SEGMENT:
      return getSegment();

    case START:
      return getStart();

    case END:
      return getEnd();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SEGMENT:
      return isSetSegment();
    case START:
      return isSetStart();
    case END:
      return isSetEnd();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoveRangeReq)
      return this.equals((RemoveRangeReq)that);
    return false;
  }

  public boolean equals(RemoveRangeReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_segment = true && this.isSetSegment();
    boolean that_present_segment = true && that.isSetSegment();
    if (this_present_segment || that_present_segment) {
      if (!(this_present_segment && that_present_segment))
        return false;
      if (!TBaseHelper.equalsSlow(this.segment, that.segment))
        return false;
    }

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (!TBaseHelper.equalsSlow(this.start, that.start))
        return false;
    }

    boolean this_present_end = true && this.isSetEnd();
    boolean that_present_end = true && that.isSetEnd();
    if (this_present_end || that_present_end) {
      if (!(this_present_end && that_present_end))
        return false;
      if (!TBaseHelper.equalsSlow(this.end, that.end))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_segment = true && (isSetSegment());
    builder.append(present_segment);
    if (present_segment)
      builder.append(segment);

    boolean present_start = true && (isSetStart());
    builder.append(present_start);
    if (present_start)
      builder.append(start);

    boolean present_end = true && (isSetEnd());
    builder.append(present_end);
    if (present_end)
      builder.append(end);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(RemoveRangeReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSegment()).compareTo(other.isSetSegment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(segment, other.segment);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(start, other.start);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetEnd()).compareTo(other.isSetEnd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(end, other.end);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SEGMENT:
          if (field.type == TType.STRING) {
            this.segment = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case START:
          if (field.type == TType.STRING) {
            this.start = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case END:
          if (field.type == TType.STRING) {
            this.end = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.segment != null) {
      oprot.writeFieldBegin(SEGMENT_FIELD_DESC);
      oprot.writeBinary(this.segment);
      oprot.writeFieldEnd();
    }
    if (this.start != null) {
      oprot.writeFieldBegin(START_FIELD_DESC);
      oprot.writeBinary(this.start);
      oprot.writeFieldEnd();
    }
    if (this.end != null) {
      oprot.writeFieldBegin(END_FIELD_DESC);
      oprot.writeBinary(this.end);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("RemoveRangeReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("segment");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSegment() == null) {
      sb.append("null");
    } else {
        int __segment_size = Math.min(this. getSegment().length, 128);
        for (int i = 0; i < __segment_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getSegment()[i]).length() > 1 ? Integer.toHexString(this. getSegment()[i]).substring(Integer.toHexString(this. getSegment()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getSegment()[i]).toUpperCase());
        }
        if (this. getSegment().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("start");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getStart() == null) {
      sb.append("null");
    } else {
        int __start_size = Math.min(this. getStart().length, 128);
        for (int i = 0; i < __start_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getStart()[i]).length() > 1 ? Integer.toHexString(this. getStart()[i]).substring(Integer.toHexString(this. getStart()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getStart()[i]).toUpperCase());
        }
        if (this. getStart().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("end");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getEnd() == null) {
      sb.append("null");
    } else {
        int __end_size = Math.min(this. getEnd().length, 128);
        for (int i = 0; i < __end_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getEnd()[i]).length() > 1 ? Integer.toHexString(this. getEnd()[i]).substring(Integer.toHexString(this. getEnd()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getEnd()[i]).toUpperCase());
        }
        if (this. getEnd().length > 128) sb.append(" ...");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

