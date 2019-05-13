package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.Company;
import com.github.sirlacky.GiveBack.domain.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddOrganizationController {

    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/admin/organizationAdministration/add")
    public String addOrganizationForm(Model model) {
        model.addAttribute("company", new Company());
        return "addOrganization";
    }

    @PostMapping("/admin/organizationAdministration/add")
    public String addOrganization(@ModelAttribute("company") Company company) {
        companyRepository.save(company);
        return "redirect:/admin";
    }

}
