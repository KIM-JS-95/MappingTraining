package com.JPA_study.ch9;


import javax.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;
    private String city;

    @Embedded
    private Address address;
    @OneToOne
    private Order order;
}
