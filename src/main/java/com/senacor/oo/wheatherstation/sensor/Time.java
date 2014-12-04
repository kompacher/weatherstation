package com.senacor.oo.wheatherstation.sensor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Time implements Sensor {

    private Long id = 4L;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getValue() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.format(new Date());
    }
}
