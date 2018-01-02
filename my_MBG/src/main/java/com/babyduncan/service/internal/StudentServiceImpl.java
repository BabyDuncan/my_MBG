package com.babyduncan.service.internal;

import com.babyduncan.dao.StudentMapper;
import com.babyduncan.model.Student;
import com.babyduncan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        int id = studentMapper.insertSelective(student);
        return student.getId();
    }
}
