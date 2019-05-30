package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.Donation;
import com.github.sirlacky.GiveBack.domain.model.User;
import com.github.sirlacky.GiveBack.domain.repositories.DonationRepository;
import com.github.sirlacky.GiveBack.domain.repositories.UserRepository;
import com.github.sirlacky.GiveBack.dtos.EditUserFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/mydonations")
public class MyDonationsController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DonationRepository donationRepository;

    Logger logger = Logger.getLogger(getClass().getName());

    @ModelAttribute("userDonations")
    public List<Donation> getUserDonations() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.getByUsername(name);
        logger.info(user.getUsername()+" pobiera listę swoich donacji");
        return user.getDonations();
    }
    @GetMapping
    String showUserDonationPage(){
        return "myDonations";
    }

}
