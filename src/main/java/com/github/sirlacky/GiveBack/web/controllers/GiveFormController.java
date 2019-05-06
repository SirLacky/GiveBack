package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.Donation;
import com.github.sirlacky.GiveBack.domain.repositories.CompanyRepository;
import com.github.sirlacky.GiveBack.domain.repositories.DonationRepository;
import com.github.sirlacky.GiveBack.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/giveform")
public class GiveFormController {

    @Autowired
    private DonationRepository donationRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping
    public String prepareGiveFormPage(Model model){
        model.addAttribute("donation", new Donation());
        return "/giveform";
    }

    @PostMapping
    public String saveDonation (@Valid @ModelAttribute("donation") Donation donation, BindingResult result){
        if(result.hasErrors()){
            return "/giveform";
        }
        donationRepository.save(donation);
        return"/usermain";
    }
}
