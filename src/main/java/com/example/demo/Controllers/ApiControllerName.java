package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiControllerName {
    String studentName="BALA";
    @GetMapping("B")
    public String getName() {
    	return "Welcome "+studentName+"!";
    }

}
