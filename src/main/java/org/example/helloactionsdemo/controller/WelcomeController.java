package org.example.helloactionsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public WelcomeController(){
    }


    @GetMapping("/welcome")
    public String welcomeString() {
        return "welcome";
    }
}
