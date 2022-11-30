package com.example.pre_pre_project.coffee.entity;

import com.example.pre_pre_project.order.entity.OrderCoffee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
    private Long coffeeId;
    private String korName;
    private String engName;
    private int price;
//    private List<OrderCoffee> orderCoffees;
}
