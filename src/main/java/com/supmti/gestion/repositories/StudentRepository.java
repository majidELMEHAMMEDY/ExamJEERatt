package com.supmti.gestion.repositories;


import com.supmti.gestion.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

     Student findByCin(Integer cin);
}
