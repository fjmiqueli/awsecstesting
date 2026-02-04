package com.javatechie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CoursehtmlController {
    @RequestMapping("/")
    public String index(){
        return "index.html"; //return the view
    }
}
