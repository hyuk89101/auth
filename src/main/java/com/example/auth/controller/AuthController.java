package com.example.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AuthController {
    @GetMapping(value = "/auth")
    public String services() {
        return String.format("auth API Port : %s", "8013");
    }
}
