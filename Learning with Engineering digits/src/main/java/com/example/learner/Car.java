package com.example.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @Autowired
    private Music music;

//    @GetMapping("/test")
   @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String firstRoute(){
        return music.dolbySound();
    }


}
