package com.example.spring_pre_project.member;

import com.example.spring_pre_project.order.Order;

import java.util.List;

public class Member {
    private Long memberId;
    private String email;
    private String name;
    private String phone;
    private List<Order> orders;
}
