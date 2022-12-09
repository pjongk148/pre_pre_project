package com.example.pre_pre_project.member.service;

import com.example.pre_pre_project.exception.BusinessLogicException;
import com.example.pre_pre_project.exception.ExceptionCode;
import com.example.pre_pre_project.member.entity.Member;
import com.example.pre_pre_project.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member) {
        //verifyExistsEmail(member.getEmail());
        return memberRepository.save(member);
    }



    public Member updateMember(Member member) {
        Member findMember = findVerifiedMember(member.getMemberId());
        Optional.ofNullable(member.getName())
                .ifPresent(name -> findMember.setName(name));
//        Optional.ofNullable(member.getPhone())
//                .ifPresent(phone -> findMember.setPhone());

        return memberRepository.save(findMember);
    }

    public Member findMember(long memberId) {
        return findVerifiedMember(memberId);
    }

    public List<Member> findMembers() {
        return (List<Member>) memberRepository.findAll();
    }

    public void deleteMember(Long memberId) {
        Member findMember = findVerifiedMember(memberId);
        memberRepository.delete(findMember);
    }

    private Member verifyExistsEmail(long memberId) {
        Optional<Member> optionalMember =
                memberRepository.findById(memberId);
        Member findMember =
                optionalMember.orElseThrow(() ->
                        new BusinessLogicException(ExceptionCode.MEMBER_NOT_FOUND));
        return findMember;
    }

    private Member findVerifiedMember(Long memberId) {
        return null;
    }
}
