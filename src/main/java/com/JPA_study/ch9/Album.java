package com.JPA_study.ch9;

import javax.persistence.Entity;

@Entity
public class Album extends Item {
    private String artist;
    private String etc;
}
