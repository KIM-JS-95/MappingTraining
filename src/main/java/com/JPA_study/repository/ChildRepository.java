package com.JPA_study.repository;

import com.JPA_study.Entity.Child;
import com.JPA_study.Entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {

    Child findByChildId(Long parentId);

    @Modifying
    @Transactional
    @Query(value = "delete from child where parent_id= :parentId", nativeQuery = true)
    int findByParentId(@Param("parentId") Long parentId);

}
