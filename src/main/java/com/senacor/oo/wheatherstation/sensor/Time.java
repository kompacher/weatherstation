package com.senacor.oo.wheatherstation.sensor;

import org.joda.time.LocalTime;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Time extends Sensor {

    public String getValue() {
        return new LocalTime().toString("HH:mm:ss");
    }
}
