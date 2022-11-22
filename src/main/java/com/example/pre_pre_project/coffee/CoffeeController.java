package com.example.pre_pre_project.coffee;

import com.example.pre_pre_project.coffee.dto.CoffeePatchDto;
import com.example.pre_pre_project.coffee.dto.CoffeePostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {
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