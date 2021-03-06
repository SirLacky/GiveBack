package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.User;
import com.github.sirlacky.GiveBack.domain.repositories.UserRepository;
import com.github.sirlacky.GiveBack.dtos.EditUserFormDTO;
import com.github.sirlacky.GiveBack.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Controller
@RequestMapping("/profile")
public class UserPersonalsEditController {


    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    public UserPersonalsEditController(UserService userService) {
        this.userService = userService;
    }

    Logger logger = Logger.getLogger(getClass().getName());


    @ModelAttribute("loggedUser")
    public User getUserPersonals() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("Pobrane dane: "+name);
        User user = userRepository.getByUsername(name);
        return user;
    }

    @GetMapping
    public String showUserPersonals(){
        return "userPersonals";
    }

    @GetMapping("/edit")
    public String sendUserIdToEditPersonals(@RequestParam Long id, Model model) {
        User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "userPersonalsEdit";
    }

    @PostMapping("/edit")
    public String editCorespondingUserPersonals(@Valid @ModelAttribute EditUserFormDTO form, BindingResult result) {
        if (result.hasErrors()) {
            return "userPersonalsEdit";
        }
        userService.editUser(form);
        logger.info("Użytkownik zmienił swoje dane: "+form.getLastName());
        return "redirect:/usermain";
    }
}
