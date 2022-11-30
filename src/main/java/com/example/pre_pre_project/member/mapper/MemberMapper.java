package com.example.pre_pre_project.member.mapper;

import com.example.pre_pre_project.member.entity.Member;
import com.example.pre_pre_project.member.dto.MemberPatchDto;
import com.example.pre_pre_project.member.dto.MemberPostDto;
import com.example.pre_pre_project.member.dto.MemberResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto(Member member);
}
