package com.example.pre_pre_project.member.service;

import com.example.pre_pre_project.member.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    public Member createMember(Member member) {
        Member createdMember = member;
        return createdMember;
    }

    public Member updateMember(Member member) {
        Member updatedMember = member;
        return updatedMember;
    }

    public Member findMember(long memberId) {
        Member member = new Member(memberId, "hgd@gmail.com", "홍길동", "010-1111-1111");
        return member;
    }

    public List<Member> findMembers() {
        List<Member> members = List.of(
                new Member(1L, "홍길동", "num1@naver.com", "010-1111-1111"),
                new Member(2L, "이몽룡", "num2@naver.com", "010-2222-2222"));
        return members;
    }

    public void deleteMember(Member member) {
    }
}
