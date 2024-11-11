package com.example.dev_porfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping
    public String displayLoginPage() {
        return "user/index";
    }

    @GetMapping("new-account")
    public String displayAddAccountPage() {
        return "user/new-account";
    }

    @PostMapping("new-account")
    public String handleAddAccountFormSubmission() {
        return "user/index";
    }
}
