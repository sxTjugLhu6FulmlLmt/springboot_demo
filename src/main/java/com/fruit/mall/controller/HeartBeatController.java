package com.fruit.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

    @GetMapping(value = {"/heart","/heart/beat"})
    public String heart(){
        return "UP";
    }
}
