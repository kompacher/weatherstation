package com.senacor.oo.wheatherstation.rest;

import java.util.Collection;

import com.senacor.oo.wheatherstation.product.Weatherstation;
import com.senacor.oo.wheatherstation.sensor.Sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class WeatherstationController {

    @Autowired
    private FooController fooController;

    private Weatherstation instance;

    @RequestMapping("/")
    public Weatherstation getWeatherstation() {
        instance.add(new Link("http://myhost/people"));
        return instance;
    }

    @RequestMapping("/foo")
    public String getFoo() {
        return new FooController().lala();
    }

    @RequestMapping("/sensors")
    public Collection<Sensor> getSensors() {
        return instance.getSensors();
    }

    @RequestMapping("/sensors/{id}")
    public Sensor getSensor(@PathVariable Long id) {
        return instance.getSensor(id);
    }

    @RequestMapping("/sensors/{id}/value")
    public String getSensorValue(@PathVariable Long id) {
        Sensor sensor = getSensor(id);
        return sensor != null ? sensor.getValue() : null;
    }

    public void setWeatherStation(Weatherstation weatherstation) {
        instance = weatherstation;
    }

}