package com.JPA_study.repository;

import com.JPA_study.Entity.Child;
import com.JPA_study.Entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

    public Parent findByParentId(Long parentId);

}
