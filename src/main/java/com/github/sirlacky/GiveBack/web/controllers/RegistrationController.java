package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.dtos.RegistrationFormDTO;
import com.github.sirlacky.GiveBack.dtos.UserDTO;
import com.github.sirlacky.GiveBack.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {


    private UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String prepareRegistrationForm(Model model) {
        model.addAttribute("registrationForm", new RegistrationFormDTO());
        return "registration";
    }

    @PostMapping //sprawdzanie czy hasla sa prawidlowe oraz czy uzytkownik juz istnieje
    public String processRegistration(@Valid @ModelAttribute("registrationForm") RegistrationFormDTO form, BindingResult result) {
        if (result.hasErrors()) {
            return "registration";
        }
        if (!checkPasswordEquality(form)) {
            result.rejectValue("password", null, "Hasło powtórzone jest niezgodne");
            return "registration";
        }

        if (!checkIsUsernameAvalible(form)) {
            result.rejectValue("username", null, "Nazwa użytkownika jest już zajęta");
            return "registration";
        }
        userService.registerUser(form);
        return "redirect:/landingpage";
    }

    private boolean checkIsUsernameAvalible(RegistrationFormDTO form) {
        UserDTO user = userService.findUser(form.getUsername());

        if (user == null) {
            return true;
        }
        return false;
    }

    private boolean checkPasswordEquality(RegistrationFormDTO form) {
        return form.getPassword().equals(form.getConfirmedPassword());
    }

}
