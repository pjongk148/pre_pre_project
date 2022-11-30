package com.example.pre_pre_project.coffee.service;

import com.example.pre_pre_project.coffee.entity.Coffee;

import java.util.List;

public class CoffeeService {

    public Coffee createCoffee(Coffee coffee) {
        Coffee createdCoffee = coffee;
        return createdCoffee;
    }

    public Coffee updateCoffee(Coffee coffee) {
        Coffee updatedCoffee = coffee;
        return updatedCoffee;
    }

    public Coffee findCoffee(long coffeeId) {
        Coffee coffee = new Coffee(coffeeId, "아이스 아메리카노", "Ice Americano", 5000);
        return coffee;
    }

    public List<Coffee> findCoffees() {
        List<Coffee> coffees = List.of(
                new Coffee(1L, "아이스 아메리카노", "Ice Americano", 4500),
                new Coffee(2L, "카페 라떼", "Caffe Latte", 5000));
        return coffees;
    }

    public void deleteCoffee(Coffee coffee) {

    }



}
