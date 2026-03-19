package com.aditya.proj1.prjcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("Health-check")
    public String Check() {
        return "Working";
    }
}
