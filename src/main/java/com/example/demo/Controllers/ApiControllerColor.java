package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiControllerColor {
    String yourFavColor="BLUE";
    @GetMapping("A")
    public String getMyFav() {
    	return "My Favourite color is "+yourFavColor;
    }

}
