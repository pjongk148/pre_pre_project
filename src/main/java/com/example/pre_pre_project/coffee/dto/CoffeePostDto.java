package com.example.pre_pre_project.coffee.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePostDto {
    private long coffeeId;

    @NotBlank
    private String korName;

    @NotBlank
    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$")
    private String engName;

    @Min(100)
    @Max(50000)
    private int price;
}
