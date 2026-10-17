package com.example.login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "login.html";
    }
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username){
        return username + "hi";
    }


}
