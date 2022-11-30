package com.example.pre_pre_project.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class MemberResponseDto {
    private long memberId;
    private String email;
    private String name;
    private String phone;
}
