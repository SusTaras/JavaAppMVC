package com.taras.sus.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/v2/employee")
public class EmployeeControllerV2 {

    @RequestMapping("/details/get")
    public String getEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "getEmployeeDetailsV2";
    }

    @RequestMapping("/details/show")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "getEmployeeDetailsV2";
        }

        switch (employee.getCar()) {
            case "BMW":
                employee.setCarMessage("BMW is definitely a good choice!");
                break;
            case "Audi":
                employee.setCarMessage("Audi is a perfect car!");
                break;
            case "Bicycle":
                employee.setCarMessage("Do you even know that bicycle is not a car?");
                break;
            default:
                employee.setCarMessage("Unknown car!");
        }

        return "showEmployeeDetailsV2";
    }
}
