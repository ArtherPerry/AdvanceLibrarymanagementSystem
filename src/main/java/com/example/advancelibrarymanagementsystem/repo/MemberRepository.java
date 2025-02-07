package com.example.advancelibrarymanagementsystem.repo;

import com.example.advancelibrarymanagementsystem.entitites.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByEmail(String email);
    Optional<Member> findByPhoneNumber(String phoneNumber);
}
