package com.babyduncan.dao;

import com.babyduncan.Gender;
import com.babyduncan.model.Student;
import com.babyduncan.model.StudentCriteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void selectByExample() throws Exception {
        StudentCriteria studentCriteria = new StudentCriteria();
        System.out.println(studentMapper.selectByExample(studentCriteria).get(0).getName());
    }

    @Test
    public void insertStudent() {

        Student student = new Student();

        student.setName("guohaozhao");
        student.setGender(Gender.MALE);
        System.out.println(studentMapper.insertSelective(student));
    }

    @Test
    public void testDistinct() {
        StudentCriteria studentCriteria = new StudentCriteria();
        studentCriteria.createCriteria().andAgeBetween(1, 20);
        long count = studentMapper.countDistinctAgeByExample(studentCriteria);
        System.out.println("COUNT IS " + count);
    }

}