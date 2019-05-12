package com.github.sirlacky.GiveBack.web.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/administration")
@Secured("ROLE_ADMIN")
public class AdminAdministration {
}
