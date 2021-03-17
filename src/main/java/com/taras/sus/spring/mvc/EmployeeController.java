package com.taras.sus.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/details/get")
    public String getEmployeeDetails() {
        return "getEmployeeDetails";
    }

    @RequestMapping("/details/show")
    public String showEmployeeDetails(@RequestParam String employeeName, Model model) {
        employeeName = "Mr. " + employeeName;

        model.addAttribute("employeeNameAttribute", employeeName);

        return "showEmployeeDetails";
    }
}
