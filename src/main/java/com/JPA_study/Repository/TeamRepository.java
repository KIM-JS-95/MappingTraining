package com.JPA_study.Repository;

import com.JPA_study.entity.Member;
import com.JPA_study.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {


}
