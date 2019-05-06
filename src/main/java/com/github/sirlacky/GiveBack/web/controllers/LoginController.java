package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.User;
import com.github.sirlacky.GiveBack.domain.repositories.UserRepository;
import com.github.sirlacky.GiveBack.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
@RequestMapping("/login")
public class LoginController {

    private UserRepository userRepository;
    private UserService userService;

    @GetMapping
    public String prepareLoginPage() {
        return "login";
    }

//    @PostMapping("/login")
//    public String loginValidation(@Valid @ModelAttribute User user, BindingResult result, HttpSession session) {
//        if (result.hasErrors()) {
//            return "loginpage";
//        }
//        User existingUser = userRepository.findFirstByUsernameAndPassword(user.getUsername(), user.getPassword());
//        if (existingUser == null) {
//            result.addError(new FieldError("user", "username", "Username or password is invalid"));
//            return "loginpage";
//        }
//        session.setAttribute("userID", existingUser.getId());
//        return "redirect:/usermain";
//    }
}
