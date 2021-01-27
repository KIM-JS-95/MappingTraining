package com.JPA_study.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Child {

    @Id
    @GeneratedValue
    private Long childId;

    @Column(name = "child_name")
    private String childName;

    @ManyToOne//referencedColumnName="parentId")
    private Parent parent;



    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public String setChildName(String childName) {
        this.childName = childName;
        return childName;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }


}