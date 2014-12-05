package com.senacor.oo.wheatherstation.rest;

import com.senacor.oo.wheatherstation.WeatherStationResourceBuilder;
import com.senacor.oo.wheatherstation.product.WeatherstationGold;
import com.senacor.oo.wheatherstation.product.WeatherstationWhite;
import com.senacor.oo.wheatherstation.sensor.Sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherstationController {

    @Autowired
    private WeatherStationResourceBuilder weatherStationResourceBuilder;

    @RequestMapping("/white")
    public WeatherstationWhite getWhite() {
        return weatherStationResourceBuilder.getWeatherstationWhite();
    }

    @RequestMapping("/gold")
    public WeatherstationGold getGold() {
        return weatherStationResourceBuilder.getWeatherstationGold();
    }

    @RequestMapping("/{stationType}/sensors/{sensorType}")
    public Sensor getSensor(@PathVariable String stationType, @PathVariable String sensorType) {
        return weatherStationResourceBuilder.getSensor(StationType.fromStringValue(stationType), sensorType);
    }
}