package com.JPA_study.ch12.src.main.java.jpabook.jpashop.web;

import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Member;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.Order;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.item.Item;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.OrderSearch;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.service.ItemService;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.service.MemberService;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: HolyEyE
 * Date: 2013. 12. 4. Time: 오후 9:07
 */
@Controller
public class OrderController {

    @Autowired OrderService orderService;
    @Autowired MemberService memberService;
    @Autowired ItemService itemService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String createForm(Model model) {

        List<Member> members = memberService.findMembers();
        List<Item> items = itemService.findItems();

        model.addAttribute("members", members);
        model.addAttribute("items", items);

        return "order/orderForm";
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String order(@RequestParam("memberId") Long memberId, @RequestParam("itemId") Long itemId, @RequestParam("count") int count) {

        orderService.order(memberId, itemId, count);
        return "redirect:/orders";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String orderList(@ModelAttribute("orderSearch") OrderSearch orderSearch, Model model) {

        List<Order> orders = orderService.findOrders(orderSearch);
        model.addAttribute("orders", orders);

        return "order/orderList";
    }

    @RequestMapping(value = "/orders/{orderId}/cancel")
    public String processCancelBuy(@PathVariable("orderId") Long orderId) {

        orderService.cancelOrder(orderId);

        return "redirect:/orders";
    }
}
