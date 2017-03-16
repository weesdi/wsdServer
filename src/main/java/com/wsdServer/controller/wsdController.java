package com.wsdServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/wsd")
public class wsdController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String getWsd {
        return "My WSD";
    }
}
