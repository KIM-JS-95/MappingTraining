package com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository.custom;

import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Order;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.OrderSearch;

import java.util.List;

/**
 * @author holyeye
 */
public interface CustomOrderRepository {

    public List<Order> search(OrderSearch orderSearch);

}
