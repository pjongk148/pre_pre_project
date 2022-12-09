package com.example.pre_pre_project.member.repository;

import com.example.pre_pre_project.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
