package com.github.sirlacky.GiveBack.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usermain")
public class UserMainPageController {

    @GetMapping
    public String preapareUserMainPage(){
        return "usermain";
    }
}
