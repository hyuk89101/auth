package com.example.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AuthController {
    @GetMapping(value = "/auth/login")
    public String services() {
        System.out.println("8013");
        return String.format("auth API Port : %s", "8013");
    }

    // message 메서드 추가
    @GetMapping("/auth/message")
    public String message() {
        log.info("auth/message");
        return "Hello World in auth.";
    }
}
