package com.supmti.gestion.controllers;

import com.supmti.gestion.entities.Student;
import com.supmti.gestion.repositories.StudentRepository;
import com.supmti.gestion.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add")
    public Student ajouter(@RequestBody Student st){
        return service.save(st);
    }

    @RequestMapping("/all")
    public Iterable<Student> findAll(){
        return service.findAll();
    }
}
