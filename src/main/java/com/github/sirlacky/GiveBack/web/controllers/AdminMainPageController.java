package com.github.sirlacky.GiveBack.web.controllers;


import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
@Secured("ROLE_ADMIN")
public class AdminMainPageController {


    @GetMapping
    public String prepareAdminMainPage(){
        return "/adminMainPage";
    }
}
