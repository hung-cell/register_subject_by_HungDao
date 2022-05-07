package com.example.major_register.controller;


import com.example.major_register.controller.model.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/test", produces = "application/json")
public class TestController {
    @GetMapping
    public ResponseEntity<Test> getTest() {
        return new ResponseEntity<>(new Test("Hello world"), HttpStatus.OK);
    }

}
