package com.babyduncan.service.internal;

import com.babyduncan.Gender;
import com.babyduncan.model.Student;
import com.babyduncan.model.StudentCriteria;
import com.babyduncan.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * http://www.mybatis.org/generator/generatedobjects/exampleClassUsage.html
 * http://www.mybatis.org/generator/reference/plugins.html
 * org.mybatis.generator.plugins.RowBoundsPlugin
 */
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
            student.setGender(Gender.FEMALE);
            student.setAge(new Random().nextInt(30));
            student.setGrade(new Random().nextInt(13));
            System.out.println(studentService.insertStudent(student));
        }
    }

    @Test
    public void testSelectList() {
        System.out.println(studentService.listSomeStudent());
    }

    @Test
    public void testSelectByPage() {
        int pageSize = 3;

        System.out.println(studentService.getByPage(pageSize, 1));
        System.out.println(studentService.getByPage(pageSize, 3));
    }

    @Test
    public void testDistinct() {
        StudentCriteria studentCriteria = new StudentCriteria();
        studentCriteria.createCriteria().andAgeBetween(1, 20);

    }
}