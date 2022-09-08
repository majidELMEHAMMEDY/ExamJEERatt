package com.supmti.gestion.services;

import com.supmti.gestion.entities.Student;
import com.supmti.gestion.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student save(Student st){
        if(st.getDateOfBirth().compareTo(LocalDate.now()) <= 0){
            throw new IllegalArgumentException("Date should be  in the future");
        }
        if( repository.findByCin(st.getCin()) != null){
            throw new IllegalArgumentException("cin already exists");
        }

        return repository.save(st);
    }
    public Iterable<Student> findAll(){
        return repository.findAll();
    }

}
