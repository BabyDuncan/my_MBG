package com.babyduncan.dao;

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

}