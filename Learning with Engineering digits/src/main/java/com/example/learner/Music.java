package com.example.learner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Music {
    public String dolbySound(){
        return "Sound";
    }

}
