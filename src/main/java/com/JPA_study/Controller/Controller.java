package com.JPA_study.Controller;


import com.JPA_study.Entity.Child;
import com.JPA_study.Entity.Parent;
import com.JPA_study.repository.ParentRepository;
import com.JPA_study.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    ParentRepository parentRepository;
    @Autowired
    ParentService parentService;

    @PostMapping("")
    @ResponseBody
    public Parent save(@RequestBody Parent parent){
        Parent saved = parentService.save(parent);
        return saved;
    }

    @GetMapping("/{id}")
    public Parent findByParentId(@PathVariable Long id){

        return parentService.findById(id);
    }

//
//    @DeleteMapping("/{id}")
//    @ResponseBody
//    public Long delete(@PathVariable Long id){
//        parentService.delete(id);
//        return id;
//    }
}
