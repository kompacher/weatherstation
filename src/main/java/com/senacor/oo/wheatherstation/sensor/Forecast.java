package com.senacor.oo.wheatherstation.sensor;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Forecast implements Sensor {

    private Long id = 1L;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getValue() {
        return "Rain";
    }
}
