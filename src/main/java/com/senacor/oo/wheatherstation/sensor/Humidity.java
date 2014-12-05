package com.senacor.oo.wheatherstation.sensor;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Humidity extends Sensor {

    public HumidityType getType() {
        return HumidityType.RELATIVE;
    }

    public Integer getValue() {
        return 81;
    }
}
