package com.taras.sus.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/details/get")
    public String getUserDetails() {
        return "getUserDetails";
    }

    @RequestMapping("/details/show")
    public String showUserDetails(@RequestParam String username, Model model) {
        username = "Mr. " + username;

        model.addAttribute("usernameAttribute", username);

        return "showUserDetails";
    }
}
