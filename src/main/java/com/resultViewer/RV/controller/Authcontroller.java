package com.resultViewer.RV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class Authcontroller {

    @GetMapping("/login")
    public String login(){
        return "loginpage";
    }
}
