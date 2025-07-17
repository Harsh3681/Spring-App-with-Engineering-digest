package com.testingCompany.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicationHealthCheck {

    @GetMapping("/appHealth")
    public String AppHealth(){
        return "Am fine !!!";
    }

}
