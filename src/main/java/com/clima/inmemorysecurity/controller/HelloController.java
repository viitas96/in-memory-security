package com.clima.inmemorysecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hiCostumer() {
        return "hi costumer!";
    }

    @GetMapping("/user")
    public String hiUser() {
        return "hi user!";
    }

    @GetMapping("/admin")
    public String hiAdmin() {
        return "hi admin!";
    }
}
