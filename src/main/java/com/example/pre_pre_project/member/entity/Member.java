package com.example.pre_pre_project.member.entity;

import com.example.pre_pre_project.order.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private Long memberId;
    private String email;
    private String name;
    private String phone;
//    private List<Order> orders;
}
