package com.example.pre_pre_project.coffee.controller;

import com.example.pre_pre_project.coffee.dto.CoffeePatchDto;
import com.example.pre_pre_project.coffee.dto.CoffeePostDto;
import com.example.pre_pre_project.coffee.mapper.CoffeeMapper;
import com.example.pre_pre_project.coffee.service.CoffeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/v1/coffees")
@Validated
public class CoffeeController {

    private final CoffeeMapper mapper;
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeMapper mapper, CoffeeService coffeeService) {
        this.mapper = mapper;
        this.coffeeService = coffeeService;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody CoffeePostDto coffeePostDto) {

        return new ResponseEntity(coffeePostDto,HttpStatus.CREATED);
    }

    @PatchMapping("{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Min(1) long coffeeId,
                              @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);
        return new ResponseEntity(coffeePatchDto, HttpStatus.OK);
    }
}