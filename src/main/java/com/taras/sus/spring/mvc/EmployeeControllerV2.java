package com.taras.sus.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v2/employee")
public class EmployeeControllerV2 {

    @RequestMapping("/details/get")
    public String getEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "getEmployeeDetailsV2";
    }

    @RequestMapping("/details/show")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        return "showEmployeeDetailsV2";
    }
}
