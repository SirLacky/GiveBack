package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.User;
import com.github.sirlacky.GiveBack.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/administration")
@Secured("ROLE_ADMIN")
public class AdminAdministrationController {

    @Autowired
    UserRepository userRepository;

    @ModelAttribute("userslist")
    public List<User> userList() {
        return userRepository.findAll();
    }

    @GetMapping
    public String prepareAdminAdministrationPage() {
        return "adminAdministrationController";
    }

    @GetMapping("/admin/administration/edit")
    public String editUser(@RequestParam Long id, Model model){
        User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "addAdmin";
    }

    @PostMapping("/admin/administration/edit")
    public String edited(@Valid @ModelAttribute User user, BindingResult result){
        if(result.hasErrors()){
            return "addAdmin";
        }
        userRepository.save(user);
        return "redirect:/admin/administration";
    }

}
