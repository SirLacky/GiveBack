package com.github.sirlacky.GiveBack.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomepageController {

    @GetMapping
    @ResponseBody
    public String mainPage(){
        return "STRONA TESTOWA";
    }
}
