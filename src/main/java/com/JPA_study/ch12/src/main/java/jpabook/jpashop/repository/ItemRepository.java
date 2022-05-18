package com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository;


import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.item.Item;
import org.hibernate.hql.internal.QueryExecutionRequestException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * User: HolyEyE
 * Date: 2013. 12. 3. Time: 오후 9:48
 */
public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {

}
