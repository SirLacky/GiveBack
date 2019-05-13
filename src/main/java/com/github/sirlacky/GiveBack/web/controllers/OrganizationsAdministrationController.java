package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.Company;
import com.github.sirlacky.GiveBack.domain.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/organizationAdministration")
//@Secured("ROLE_ADMIN")
public class OrganizationsAdministrationController {

    @Autowired
    CompanyRepository companyRepository;

    @ModelAttribute("companylist")
    public List<Company> companyList() {
        return companyRepository.findAll();
    }
    @GetMapping
    public String prepareOrganizationListPage(){
        return "organizationsAdministration";
    }

}
