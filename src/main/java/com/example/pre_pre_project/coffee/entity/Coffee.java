package com.example.pre_pre_project.coffee.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {

    @Id
    private Long coffeeId;
    private String korName;
    private String engName;
    private int price;
    private String coffeeCode;
//    private List<OrderCoffee> orderCoffees;
}
