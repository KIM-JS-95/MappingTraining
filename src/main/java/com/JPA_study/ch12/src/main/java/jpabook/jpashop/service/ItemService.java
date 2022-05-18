package com.JPA_study.ch12.src.main.java.jpabook.jpashop.service;

import com.JPA_study.ch12.src.main.java.jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import com.JPA_study.ch12.src.main.java.jpabook.jpashop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: HolyEyE
 * Date: 2013. 12. 3. Time: 오후 9:43
 */
@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void saveItem(Book item) {
        itemRepository.save(item);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
}
