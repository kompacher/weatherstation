package com.senacor.oo.wheatherstation.product;

import com.senacor.oo.wheatherstation.sensor.Forecast;
import com.senacor.oo.wheatherstation.sensor.Humidity;
import com.senacor.oo.wheatherstation.sensor.Temperature;
import com.senacor.oo.wheatherstation.sensor.Time;

import org.springframework.stereotype.Component;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
@Component
public class WeatherstationGold extends Weatherstation {

    @Override
    public String getName() {
        return "WS-Gold";
    }

    public WeatherstationGold() {
        addSensor("temperature", new Temperature());
        addSensor("humidity", new Humidity());
        addSensor("time", new Time());
        addSensor("temperatureTerrace", new Temperature());
        addSensor("forecast", new Forecast());
    }
}
