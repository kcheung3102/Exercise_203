package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/employeeform")
    public String loadFormPage(Model model ) {
        model.addAttribute("employee", new Employee());
        return "employeeform"
    }
}