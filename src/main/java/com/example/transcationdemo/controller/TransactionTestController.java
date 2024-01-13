package com.example.transcationdemo.controller;

import com.example.transcationdemo.step15.Step15Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/run")
@RequiredArgsConstructor
public class TransactionTestController {

    private final Step15Service service;

    @GetMapping
    public ResponseEntity<Void> runBabyRun() {
        service.run();
        return ResponseEntity.ok().build();
    }
}
