package com.Dewmal.rentacar.demoapplication.repository;

import com.Dewmal.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //Student save(Student student);
}
