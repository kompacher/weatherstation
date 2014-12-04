package com.senacor.oo.wheatherstation.product;

import java.util.Collection;

import com.senacor.oo.wheatherstation.sensor.Sensor;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public abstract class Weatherstation extends ResourceSupport {

    public abstract Collection<Sensor> getSensors();

    public abstract Sensor getSensor(Long id);

    abstract void reset();

    abstract String getStatus();

    abstract String getInfo();
}
