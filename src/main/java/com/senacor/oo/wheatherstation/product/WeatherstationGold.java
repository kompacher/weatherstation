package com.senacor.oo.wheatherstation.product;

import com.senacor.oo.wheatherstation.sensor.Forecast;
import com.senacor.oo.wheatherstation.sensor.Huminity;
import com.senacor.oo.wheatherstation.sensor.Temperature;
import com.senacor.oo.wheatherstation.sensor.Time;

import org.springframework.stereotype.Component;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
@Component
public class WeatherstationGold extends BasicWeatherstation {

    public WeatherstationGold() {
        addSensor(new Temperature());
        addSensor(new Huminity());
        addSensor(new Time());
        addSensor(new Temperature());
        addSensor(new Forecast());
    }
}
