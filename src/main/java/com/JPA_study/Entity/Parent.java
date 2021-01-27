package com.JPA_study.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Data
public class Parent {
    @Id
    @GeneratedValue
    @Column(name="parent_id")
    private Long parentId;

    @Column(name = "parent_name")
    private String parentName;

    @OneToMany(cascade = ALL, mappedBy = "parent")
    @JoinColumn(name = "parent_id")
    private List<Child> child = new ArrayList<>();


    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }
}