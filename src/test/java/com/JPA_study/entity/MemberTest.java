package com.JPA_study.entity;

import com.JPA_study.Repository.MemberRepository;
import com.JPA_study.Repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class MemberTest  {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Test
    public void creat(){
        Team team1 = Team.builder()
                .id("team1")
                .name("팀1")
                .build();

        teamRepository.save(team1);

        Member member1  = Member.builder()
                .id("member1")
                .username("회원1")
                .build();

        Member member2  = Member.builder()
                .id("member2")
                .username("회원2")
                .build();

        member1.setTeam(team1);
        member2.setTeam(team1);

        memberRepository.save(member1);
        memberRepository.save(member2);

        // 리스트 저장 데이터 출력
        List<Member> members = memberRepository.findAll();

        for(Member val : members)
        System.out.println(val.getTeam().getName());
    }
}