package com.JPA_study.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "ORDERITEM_ID")
    private Long id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Orders orders;

    private int orderPrice;

    private int count;
}
