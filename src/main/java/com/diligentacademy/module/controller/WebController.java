package com.diligentacademy.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author George Okereka
 * Created on 10/08/2020
 */

@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping({"/","/home","index","index.html"})
    public String getHomePage(){
        return "index";
    }

}
