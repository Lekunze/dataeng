package kstreams.exercise3.serdes;


import kstreams.exercise2.model.Temperature;
import kstreams.exercise2.serialization.TemperatureSerializer;
import kstreams.exercise2.serialization.TemperatureDeserializer;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class TemperatureSerde implements Serde<Temperature> {

    TemperatureSerializer serializer = new TemperatureSerializer();
    TemperatureDeserializer deserializer = new TemperatureDeserializer();

    @Override
    public Serializer<Temperature> serializer() {
        return (topic, data) -> serializer.serialize(topic, data);
    }

    @Override
    public Deserializer<Temperature> deserializer() {
        return (topic, data) -> deserializer.deserialize(topic, data);
    }
}