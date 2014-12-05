package com.senacor.oo.wheatherstation.sensor;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Temperature extends Sensor {

    public TemperatureUnit getUnit() {
        return TemperatureUnit.CELSIUS;
    }

    public String getValue() {
        return "32.29";
    }
}
