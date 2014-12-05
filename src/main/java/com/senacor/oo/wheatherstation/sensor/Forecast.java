package com.senacor.oo.wheatherstation.sensor;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import org.joda.time.LocalDate;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
public class Forecast extends Sensor {

    public Map<String, ForecastType> getValue() {
        Map<String, ForecastType> weatherForecast = new TreeMap<String, ForecastType>();
        for(int i = 1; i <= 7; i++) {
            weatherForecast.put(new LocalDate().plusDays(i).toString("dd.MM.yyyy"), getRandomType());
        }
        return weatherForecast;
    }

    private ForecastType getRandomType() {
        return ForecastType.values()[new Random().nextInt(ForecastType.values().length)];
    }
}
