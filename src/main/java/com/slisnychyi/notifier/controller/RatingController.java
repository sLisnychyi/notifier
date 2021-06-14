package com.slisnychyi.notifier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RatingController {
    @GetMapping
    public Mono<String> getValue() {
        return Mono.just("i'am controller");
    }
}
