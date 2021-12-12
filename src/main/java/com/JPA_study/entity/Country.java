package com.JPA_study.entity;


import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class Country {

    @Id
    private Long Code;
    private String Name;
    private String Continent;
    private String Region;

}
