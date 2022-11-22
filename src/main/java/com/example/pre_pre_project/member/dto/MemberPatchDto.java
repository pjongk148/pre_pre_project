package com.example.pre_pre_project.member.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MemberPatchDto {
    private long memberId;

    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "회원 이름은 공백이 아니어야 합니다.")
    private String name;

    @Pattern(regexp = "^010-\\d{3,4}-\\{4}$")
    private String phone;
}
