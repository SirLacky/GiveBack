package com.github.sirlacky.GiveBack.web.controllers;

import com.github.sirlacky.GiveBack.domain.model.Company;
import com.github.sirlacky.GiveBack.domain.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin/organizationAdministration")
//@Secured("ROLE_ADMIN")
public class OrganizationsAdministrationController {

    @Autowired
    CompanyRepository companyRepository;

    Logger logger = Logger.getLogger(getClass().getName());

    @ModelAttribute("companylist")
    public List<Company> companyList() {
        return companyRepository.findAll();
    }
    @GetMapping
    public String prepareOrganizationListPage(){
        return "organizationsAdministration";
    }

    @GetMapping("/edit")
    public String sendCompanyIdToEdit(@RequestParam Long id, Model model) {
        Company company = companyRepository.findOne(id);
        model.addAttribute("company", company);
        return "addOrganization";
    }

    @PostMapping("/edit")
    public String editCorespondingCompany(@ModelAttribute Company company) {
        companyRepository.save(company);
        logger.info("Zedytowano organizację "+company.getName());
        return "redirect:/admin/organizationAdministration";
    }

    @GetMapping("/delete")
    public String deleteCompany(@RequestParam Long id) {
        Company company = companyRepository.findOne(id);
        companyRepository.delete(company);
        logger.info("Usunięto organizację: "+company.getName());
        return "redirect:/admin/organizationAdministration";
    }



}
