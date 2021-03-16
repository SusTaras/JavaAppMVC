package com.taras.sus.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/details/get")
    public String getUserDetails() {
        return "getUserDetails";
    }

    @RequestMapping("/details/show")
    public String showUserDetails() {
        return "showUserDetails";
    }
}
