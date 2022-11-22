package com.example.pre_pre_project.coffee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {
    @PostMapping
    public String postMember() {
        return null;
    }
}
