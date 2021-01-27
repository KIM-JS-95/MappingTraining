package com.JPA_study.service;

import com.JPA_study.Entity.Child;
import com.JPA_study.Entity.Parent;
import com.JPA_study.repository.ChildRepository;
import com.JPA_study.repository.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;
    @Autowired
    private ChildRepository childRepository;


    @Transactional
    public Parent save(Parent parent) {
    parent = parentRepository.save(parent);
        return parent;
    }

    @Transactional
    public Parent findByParentId(Long id){
        Parent entity = parentRepository.findByParentId(id);
        return entity;
    }

    @Transactional
    public Child delete(Long id){
        Child child = childRepository.findByChildId(id);

        //child.setParent(null);
//        Parent parent = parentRepository.findByParentId(id);
//        parentRepository.delete(parent);

        return child;
    }
}
