package com.senacor.oo.wheatherstation.rest;

import javax.annotation.PostConstruct;

import com.senacor.oo.wheatherstation.product.WeatherstationWhite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Georg Kompacher, Senacor Technologies AG
*/
@RestController
@RequestMapping("/wswhite")
public class WSWhiteController extends WeatherstationController {

    @Autowired
    private WeatherstationWhite m_weatherstationWhite;

    @PostConstruct
    public void init() {
        setWeatherStation(m_weatherstationWhite);
    }

}
