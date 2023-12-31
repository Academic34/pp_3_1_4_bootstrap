package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.entity.User;
import ru.kata.spring.boot_security.demo.services.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping()
//    public String showUser(Model model,  Principal principal) {
//        String name = principal.getName();
//        User user = userService.getUserByName(principal.getName());
//        model.addAttribute("user", user);
//        return "user";
//    }

    @GetMapping()
    public String showUser(@AuthenticationPrincipal User principaluser, Model model) {
        model.addAttribute("user", principaluser);
        return "user";
    }
}
