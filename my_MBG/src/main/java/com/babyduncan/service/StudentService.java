package com.babyduncan.service;

import com.babyduncan.model.Student;

import java.util.List;


public interface StudentService {

    int insertStudent(Student student);


    List<Student> listSomeStudent();

    List<Student> getByPage(int pageSize, int pageNum);

}
