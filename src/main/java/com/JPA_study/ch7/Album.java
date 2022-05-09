package com.JPA_study.ch7;

import javax.persistence.Entity;

@Entity
public class Album extends Item {
    private String artist;
    private String etc;
}
