package com.JPA_study.ch9;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    private Date createDate;
    private Date lastModifiedDate;
}
