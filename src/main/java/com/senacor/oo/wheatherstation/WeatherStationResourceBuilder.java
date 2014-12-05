package com.senacor.oo.wheatherstation;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.Collection;

import com.senacor.oo.wheatherstation.product.Weatherstation;
import com.senacor.oo.wheatherstation.product.WeatherstationGold;
import com.senacor.oo.wheatherstation.product.WeatherstationWhite;
import com.senacor.oo.wheatherstation.rest.StationType;
import com.senacor.oo.wheatherstation.rest.WeatherstationController;
import com.senacor.oo.wheatherstation.sensor.Sensor;

import org.springframework.stereotype.Component;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
@Component
public class WeatherStationResourceBuilder {

    public WeatherstationWhite getWeatherstationWhite() {
        WeatherstationWhite weatherstationWhite = new WeatherstationWhite();
        weatherstationWhite.add(linkTo(methodOn(WeatherstationController.class).getWhite()).withSelfRel());
        Collection<String> sensorTypes = weatherstationWhite.getSensorTypes();
        for (String sensorType : sensorTypes) {
            weatherstationWhite.add(linkTo(methodOn(WeatherstationController.class).getSensor(StationType.WHITE.toStringValue(), sensorType)).withRel(sensorType));
        }
        return weatherstationWhite;
    }

    public WeatherstationGold getWeatherstationGold() {
        WeatherstationGold weatherstationGold = new WeatherstationGold();
        weatherstationGold.add(linkTo(methodOn(WeatherstationController.class).getGold()).withSelfRel());
        Collection<String> sensorTypes = weatherstationGold.getSensorTypes();
        for (String sensorType : sensorTypes) {
            weatherstationGold.add(linkTo(methodOn(WeatherstationController.class).getSensor(StationType.GOLD.toStringValue(), sensorType)).withRel(sensorType));
        }
        return weatherstationGold;
    }

    public Sensor getSensor(StationType stationType, String sensorType) {
        Weatherstation weatherstation = getWeatherstation(stationType);
        Sensor sensor = weatherstation.getSensor(sensorType);
        sensor.add(linkTo(methodOn(WeatherstationController.class).getSensor(stationType.toStringValue(), sensorType)).withSelfRel());
        return sensor;
    }

    private Weatherstation getWeatherstation(StationType type) {
        switch (type) {
            case GOLD:
                return new WeatherstationGold();
            case WHITE:
                return new WeatherstationWhite();
            default:
                throw new IllegalArgumentException(String.format("Type %s not valid.", type));
        }
    }
}
