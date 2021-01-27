package com.JPA_study.repository;

import com.JPA_study.Entity.Child;
import com.JPA_study.Entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {

    //@Query("select * from CHILD_ID WHERE PARENT_ID= parentId ")
    public Child findByChildId(Long parentId);

}
