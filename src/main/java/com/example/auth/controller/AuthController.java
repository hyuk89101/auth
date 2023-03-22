package com.example.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AuthController {
    @GetMapping(value = "/auth/login")
    public String services() {
        return String.format("auth API Port : %s", "8013");
    }

    // message 메서드 추가
    @GetMapping("/auth/message")
    public String message(@RequestHeader("third-request") String header) {
        log.info(header);
        return "Hello World in auth.";
    }
}
