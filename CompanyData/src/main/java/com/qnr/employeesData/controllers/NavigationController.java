/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qnr.employeesData.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author RG
 */
@Controller
public class NavigationController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/locations/{id}")
    public String showLocations(@PathVariable int id) {
        return "locations";
    }

    @GetMapping("/departments/{id}")
    public String showDepartments(@PathVariable int id) {
        return "departments";
    }
    
    @GetMapping("/employees/{id}")
    public String showEmployees(@PathVariable int id) {
        return "employees";
    }
    
    @GetMapping("/empdetails/{id}")
    public String showEmpDetails(@PathVariable int id) {
        return "empDetails";
    }
    
}
