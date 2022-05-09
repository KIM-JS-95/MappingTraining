package com.JPA_study.ch8;

import javax.persistence.Entity;

@Entity
public class Book extends Item {
    private String author;
    private String isbn;
}


