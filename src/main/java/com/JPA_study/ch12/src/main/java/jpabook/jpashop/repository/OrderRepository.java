package com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository;

import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Order;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository.custom.CustomOrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * User: HolyEyE
 * Date: 2013. 12. 3. Time: 오후 10:28
 */
public interface OrderRepository extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order>, CustomOrderRepository {

}
