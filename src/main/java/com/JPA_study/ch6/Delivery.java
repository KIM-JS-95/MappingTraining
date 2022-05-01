package com.JPA_study.ch6;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String street;
    private String zipcode;
    private DeliveryStatus status;

    @OneToOne
    private Order order;
}
