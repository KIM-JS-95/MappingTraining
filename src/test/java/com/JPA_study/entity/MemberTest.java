package com.JPA_study.entity;

import com.JPA_study.Repository.MemberRepository;
import com.JPA_study.Repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.List;


class MemberTest  {

    @Mock
    private MemberRepository memberRepository;

    @Mock
    private TeamRepository teamRepository;

    @Test
    public void creat(){
        Member member1 = new Member("member1", "회원1");
        Member member2 = new Member("member2", "회원2");
        Team team1 = new Team("team1", "팀1");

        member1.setTeam(team1);
        member2.setTeam(team1);

        teamRepository.save(team1);
        memberRepository.save(member1);

        // 리스트 저장 데이터 출력
        List<Member> members = team1.getMembers();

        for(Member val : members)
        System.out.println(val.getTeam().getName());
    }
}