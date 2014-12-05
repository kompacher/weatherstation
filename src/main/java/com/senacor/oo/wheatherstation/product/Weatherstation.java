package com.senacor.oo.wheatherstation.product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senacor.oo.wheatherstation.sensor.Sensor;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public abstract class Weatherstation extends ResourceSupport {

    private Map<String, Sensor> sensors = new HashMap<String, Sensor>();
    @JsonIgnore
    public Collection<String> getSensorTypes() {
        return sensors.keySet();
    }
    @JsonIgnore
    public Collection<Sensor> getSensors() {
        return sensors.values();
    }

    public abstract String getName();

    public Sensor getSensor(String type) {
        return sensors.get(type);
    }

    public boolean hasSensorOfType(String type) {
        return sensors.containsKey(type);
    }

    protected void addSensor(String type, Sensor sensor) {
        sensors.put(type, sensor);
    }
}
