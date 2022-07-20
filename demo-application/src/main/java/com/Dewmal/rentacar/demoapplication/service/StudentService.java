package com.Dewmal.rentacar.demoapplication.service;

import com.Dewmal.rentacar.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);

    Student fetchStudentById(int id);
}
