package com.senacor.oo.wheatherstation.product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.senacor.oo.wheatherstation.sensor.Sensor;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public abstract class BasicWeatherstation extends Weatherstation {

    private Map<Long, Sensor> sensors = new HashMap<Long, Sensor>();

    @Override
    public Collection<Sensor> getSensors() {
        return sensors.values();
    }

    @Override
    public Sensor getSensor(Long id) {
        return sensors.get(id);
    }

    @Override
    public void reset() {

    }

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public String getInfo() {
        return null;
    }

    protected void addSensor(Sensor sensor) {
        sensors.put(sensor.getId(), sensor);
    }
}
