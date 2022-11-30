package com.example.pre_pre_project.coffee.mapper;

import com.example.pre_pre_project.coffee.dto.CoffeePatchDto;
import com.example.pre_pre_project.coffee.dto.CoffeePostDto;
import com.example.pre_pre_project.coffee.dto.CoffeeResponseDto;
import com.example.pre_pre_project.coffee.entity.Coffee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
}
