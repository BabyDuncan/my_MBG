package com.babyduncan.service.internal;

import com.babyduncan.Gender;
import com.babyduncan.model.Student;
import com.babyduncan.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void insertStudent() {
        Student student = new Student();
        student.setName("guohaozhao");
        student.setGender(Gender.MALE);
        System.out.println(studentService.insertStudent(student));
    }

    @Test
    public void insertManyStudent() {
        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.setName("guohaozhao" + new Random().nextInt(100));
            student.setGender(Gender.MALE);
            System.out.println(studentService.insertStudent(student));
        }
    }
}