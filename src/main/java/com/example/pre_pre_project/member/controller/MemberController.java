package com.example.pre_pre_project.member.controller;

import com.example.pre_pre_project.member.entity.Member;
import com.example.pre_pre_project.member.service.MemberService;
import com.example.pre_pre_project.member.dto.MemberPatchDto;
import com.example.pre_pre_project.member.dto.MemberPostDto;
import com.example.pre_pre_project.member.mapper.MemberMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/v1/members")
@Validated
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberDto) {
        Member member = mapper.memberPostDtoToMember(memberDto);
        Member response = memberService.createMember(member);

        return new ResponseEntity(mapper.memberToMemberResponseDto(response), HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Positive long memberId,
                                    @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        Member response = memberService.updateMember(mapper.memberPatchDtoToMember(memberPatchDto));
        return new ResponseEntity<>(mapper.memberToMemberResponseDto(response), HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") @Positive long memberId) {
        Member response = memberService.findMember(memberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getMembers() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") @Positive long memberId) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
