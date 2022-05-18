package com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository;


import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: HolyEyE
 * Date: 2013. 12. 3. Time: 오전 1:08
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByName(String name);
}
