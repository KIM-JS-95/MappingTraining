package com.JPA_study.ch12.src.test.java.jpabook.jpashop.repository;

import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Member;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Order;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.OrderSearch;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.OrderStatus;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.item.Book;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository.OrderRepository;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.service.ItemService;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.service.MemberService;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appConfig.xml")
@Transactional
public class OrderRepositoryTest {

    @Autowired
    MemberService memberService;
    @Autowired
    ItemService itemService;
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @Test
    public void test() throws Exception {

        //Given
        Member member = createMember("hello");
        Book book = createItem("시골 Book", 10);
        orderService.order(member.getId(), book.getId(), 1);

        //When
        OrderSearch orderSearch = new OrderSearch();
        orderSearch.setMemberName("hello");
        orderSearch.setOrderStatus(OrderStatus.ORDER);

        List<Order> search = orderRepository.search(orderSearch);

        //Then
        Assert.assertEquals(1, search.size());
    }

    private Member createMember(String name) {
        Member member = new Member();
        member.setName(name);
        memberService.join(member);
        return member;
    }

    private Book createItem(String name, int stockQuantity) {
        Book book = new Book();
        book.setName(name);
        book.setStockQuantity(stockQuantity);
        itemService.saveItem(book);
        return book;
    }

}