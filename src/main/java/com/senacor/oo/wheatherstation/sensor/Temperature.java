package com.senacor.oo.wheatherstation.sensor;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Temperature implements Sensor {

    private Long id = 3L;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getValue() {
        return "22.2";
    }
}
