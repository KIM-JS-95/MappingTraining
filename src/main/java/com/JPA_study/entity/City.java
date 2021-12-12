package com.JPA_study.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class City {

    @Id
    private Long ID;
    private String Name;
    private String District;
    private String Population;

    @OneToMany
    private Country country;

}
