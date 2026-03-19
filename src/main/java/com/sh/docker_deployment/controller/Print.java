package com.sh.docker_deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Print {

    @GetMapping("/print")
    public String print(){
        return "This is test for deployment CI/CD  for test 18-03-2026 test after run count1";
    }
}
