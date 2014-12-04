package com.senacor.oo.wheatherstation.sensor;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Huminity implements Sensor {

    private Long id = 2L;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getValue() {
        return "81";
    }
}
