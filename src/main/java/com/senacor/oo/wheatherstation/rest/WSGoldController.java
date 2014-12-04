package com.senacor.oo.wheatherstation.rest;

import javax.annotation.PostConstruct;

import com.senacor.oo.wheatherstation.product.WeatherstationGold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Georg Kompacher, Senacor Technologies AG
*/
@RestController
@RequestMapping("/wsgold")
public class WSGoldController extends WeatherstationController {

    @Autowired
    private WeatherstationGold m_weatherstationGold;

    @PostConstruct
    public void init() {
        setWeatherStation(m_weatherstationGold);
    }

}
