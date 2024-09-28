package org.example.controller;

import org.example.domain.UserDocument;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public Mono<?> test() {
        return Mono.just(UserDocument.builder()
                .id("sdfgjehrtuoi")
                .email("a@a.com")
                .name("a")
                .build());
    }
}
