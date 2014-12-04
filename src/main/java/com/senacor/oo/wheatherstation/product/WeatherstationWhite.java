package com.senacor.oo.wheatherstation.product;

import com.senacor.oo.wheatherstation.sensor.Huminity;
import com.senacor.oo.wheatherstation.sensor.Temperature;
import com.senacor.oo.wheatherstation.sensor.Time;

import org.springframework.stereotype.Component;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
@Component
public class WeatherstationWhite extends BasicWeatherstation {

    public WeatherstationWhite() {
        addSensor(new Temperature());
        addSensor(new Huminity());
        addSensor(new Time());
    }
}
