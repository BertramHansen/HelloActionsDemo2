package org.example.helloactionsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    public WelcomeController(){
    }


    @GetMapping()
    public String welcomeString() {
        return "welcome";
    }
}
