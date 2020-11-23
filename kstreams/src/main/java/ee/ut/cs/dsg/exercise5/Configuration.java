/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ee.ut.cs.dsg.exercise5;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Configuration extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7695236011538915248L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Configuration\",\"namespace\":\"ee.ut.cs.dsg.exercise5\",\"fields\":[{\"name\":\"prefVal\",\"type\":\"double\",\"doc\":\"The preferred value from the measurement\"},{\"name\":\"measurement\",\"type\":\"string\",\"doc\":\"The measurement type, e.g., temperature\"},{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"The measurement timestamp\"},{\"name\":\"author\",\"type\":\"string\",\"doc\":\"The author of the configuration\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Configuration> ENCODER =
      new BinaryMessageEncoder<Configuration>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Configuration> DECODER =
      new BinaryMessageDecoder<Configuration>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Configuration> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Configuration> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Configuration> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Configuration>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Configuration to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Configuration from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Configuration instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Configuration fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The preferred value from the measurement */
   private double prefVal;
  /** The measurement type, e.g., temperature */
   private java.lang.CharSequence measurement;
  /** The measurement timestamp */
   private long timestamp;
  /** The author of the configuration */
   private java.lang.CharSequence author;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Configuration() {}

  /**
   * All-args constructor.
   * @param prefVal The preferred value from the measurement
   * @param measurement The measurement type, e.g., temperature
   * @param timestamp The measurement timestamp
   * @param author The author of the configuration
   */
  public Configuration(java.lang.Double prefVal, java.lang.CharSequence measurement, java.lang.Long timestamp, java.lang.CharSequence author) {
    this.prefVal = prefVal;
    this.measurement = measurement;
    this.timestamp = timestamp;
    this.author = author;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return prefVal;
    case 1: return measurement;
    case 2: return timestamp;
    case 3: return author;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: prefVal = (java.lang.Double)value$; break;
    case 1: measurement = (java.lang.CharSequence)value$; break;
    case 2: timestamp = (java.lang.Long)value$; break;
    case 3: author = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'prefVal' field.
   * @return The preferred value from the measurement
   */
  public double getPrefVal() {
    return prefVal;
  }


  /**
   * Sets the value of the 'prefVal' field.
   * The preferred value from the measurement
   * @param value the value to set.
   */
  public void setPrefVal(double value) {
    this.prefVal = value;
  }

  /**
   * Gets the value of the 'measurement' field.
   * @return The measurement type, e.g., temperature
   */
  public java.lang.CharSequence getMeasurement() {
    return measurement;
  }


  /**
   * Sets the value of the 'measurement' field.
   * The measurement type, e.g., temperature
   * @param value the value to set.
   */
  public void setMeasurement(java.lang.CharSequence value) {
    this.measurement = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The measurement timestamp
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * The measurement timestamp
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'author' field.
   * @return The author of the configuration
   */
  public java.lang.CharSequence getAuthor() {
    return author;
  }


  /**
   * Sets the value of the 'author' field.
   * The author of the configuration
   * @param value the value to set.
   */
  public void setAuthor(java.lang.CharSequence value) {
    this.author = value;
  }

  /**
   * Creates a new Configuration RecordBuilder.
   * @return A new Configuration RecordBuilder
   */
  public static ee.ut.cs.dsg.exercise5.Configuration.Builder newBuilder() {
    return new ee.ut.cs.dsg.exercise5.Configuration.Builder();
  }

  /**
   * Creates a new Configuration RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Configuration RecordBuilder
   */
  public static ee.ut.cs.dsg.exercise5.Configuration.Builder newBuilder(ee.ut.cs.dsg.exercise5.Configuration.Builder other) {
    if (other == null) {
      return new ee.ut.cs.dsg.exercise5.Configuration.Builder();
    } else {
      return new ee.ut.cs.dsg.exercise5.Configuration.Builder(other);
    }
  }

  /**
   * Creates a new Configuration RecordBuilder by copying an existing Configuration instance.
   * @param other The existing instance to copy.
   * @return A new Configuration RecordBuilder
   */
  public static ee.ut.cs.dsg.exercise5.Configuration.Builder newBuilder(ee.ut.cs.dsg.exercise5.Configuration other) {
    if (other == null) {
      return new ee.ut.cs.dsg.exercise5.Configuration.Builder();
    } else {
      return new ee.ut.cs.dsg.exercise5.Configuration.Builder(other);
    }
  }

  /**
   * RecordBuilder for Configuration instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Configuration>
    implements org.apache.avro.data.RecordBuilder<Configuration> {

    /** The preferred value from the measurement */
    private double prefVal;
    /** The measurement type, e.g., temperature */
    private java.lang.CharSequence measurement;
    /** The measurement timestamp */
    private long timestamp;
    /** The author of the configuration */
    private java.lang.CharSequence author;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ee.ut.cs.dsg.exercise5.Configuration.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.prefVal)) {
        this.prefVal = data().deepCopy(fields()[0].schema(), other.prefVal);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.measurement)) {
        this.measurement = data().deepCopy(fields()[1].schema(), other.measurement);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.author)) {
        this.author = data().deepCopy(fields()[3].schema(), other.author);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Configuration instance
     * @param other The existing instance to copy.
     */
    private Builder(ee.ut.cs.dsg.exercise5.Configuration other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.prefVal)) {
        this.prefVal = data().deepCopy(fields()[0].schema(), other.prefVal);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.measurement)) {
        this.measurement = data().deepCopy(fields()[1].schema(), other.measurement);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.author)) {
        this.author = data().deepCopy(fields()[3].schema(), other.author);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'prefVal' field.
      * The preferred value from the measurement
      * @return The value.
      */
    public double getPrefVal() {
      return prefVal;
    }


    /**
      * Sets the value of the 'prefVal' field.
      * The preferred value from the measurement
      * @param value The value of 'prefVal'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder setPrefVal(double value) {
      validate(fields()[0], value);
      this.prefVal = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'prefVal' field has been set.
      * The preferred value from the measurement
      * @return True if the 'prefVal' field has been set, false otherwise.
      */
    public boolean hasPrefVal() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'prefVal' field.
      * The preferred value from the measurement
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder clearPrefVal() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'measurement' field.
      * The measurement type, e.g., temperature
      * @return The value.
      */
    public java.lang.CharSequence getMeasurement() {
      return measurement;
    }


    /**
      * Sets the value of the 'measurement' field.
      * The measurement type, e.g., temperature
      * @param value The value of 'measurement'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder setMeasurement(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.measurement = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'measurement' field has been set.
      * The measurement type, e.g., temperature
      * @return True if the 'measurement' field has been set, false otherwise.
      */
    public boolean hasMeasurement() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'measurement' field.
      * The measurement type, e.g., temperature
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder clearMeasurement() {
      measurement = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * The measurement timestamp
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * The measurement timestamp
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * The measurement timestamp
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * The measurement timestamp
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'author' field.
      * The author of the configuration
      * @return The value.
      */
    public java.lang.CharSequence getAuthor() {
      return author;
    }


    /**
      * Sets the value of the 'author' field.
      * The author of the configuration
      * @param value The value of 'author'.
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder setAuthor(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.author = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'author' field has been set.
      * The author of the configuration
      * @return True if the 'author' field has been set, false otherwise.
      */
    public boolean hasAuthor() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'author' field.
      * The author of the configuration
      * @return This builder.
      */
    public ee.ut.cs.dsg.exercise5.Configuration.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Configuration build() {
      try {
        Configuration record = new Configuration();
        record.prefVal = fieldSetFlags()[0] ? this.prefVal : (java.lang.Double) defaultValue(fields()[0]);
        record.measurement = fieldSetFlags()[1] ? this.measurement : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        record.author = fieldSetFlags()[3] ? this.author : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Configuration>
    WRITER$ = (org.apache.avro.io.DatumWriter<Configuration>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Configuration>
    READER$ = (org.apache.avro.io.DatumReader<Configuration>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeDouble(this.prefVal);

    out.writeString(this.measurement);

    out.writeLong(this.timestamp);

    out.writeString(this.author);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.prefVal = in.readDouble();

      this.measurement = in.readString(this.measurement instanceof Utf8 ? (Utf8)this.measurement : null);

      this.timestamp = in.readLong();

      this.author = in.readString(this.author instanceof Utf8 ? (Utf8)this.author : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.prefVal = in.readDouble();
          break;

        case 1:
          this.measurement = in.readString(this.measurement instanceof Utf8 ? (Utf8)this.measurement : null);
          break;

        case 2:
          this.timestamp = in.readLong();
          break;

        case 3:
          this.author = in.readString(this.author instanceof Utf8 ? (Utf8)this.author : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










