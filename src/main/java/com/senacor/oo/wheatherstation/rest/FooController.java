package com.senacor.oo.wheatherstation.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Georg Kompacher, Senacor Technologies AG
 */
@RestController
public class FooController {

    @RequestMapping("/lala")
    public String lala() {
        return "foo";
    }
}
