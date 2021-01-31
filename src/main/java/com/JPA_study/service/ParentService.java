package com.JPA_study.service;

import com.JPA_study.Entity.Child;
import com.JPA_study.Entity.Parent;
import com.JPA_study.repository.ChildRepository;
import com.JPA_study.repository.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Null;


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
    public Parent findById(Long id){
        Parent entity = parentRepository.findByParentId(id);



        return entity;
    }

    @Transactional
    public void delete(Long id){
        //Child child = childRepository.findByChildId(id);
        Parent parent = parentRepository.findByParentId(id);
        //child.setParent(null);

        //childRepository.findByParentId(id);
        parentRepository.delete(parent);
    }
}
