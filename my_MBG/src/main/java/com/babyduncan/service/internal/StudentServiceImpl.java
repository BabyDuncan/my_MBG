package com.babyduncan.service.internal;

import com.babyduncan.dao.StudentMapper;
import com.babyduncan.model.Student;
import com.babyduncan.model.StudentCriteria;
import com.babyduncan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        int id = studentMapper.insertSelective(student);
        return student.getId();
    }

    @Override
    public List<Student> listSomeStudent() {
        StudentCriteria studentCriteria = new StudentCriteria();
        studentCriteria.or().andNameLike("%guohaozhao1%").andAgeGreaterThan(10);
        studentCriteria.or().andGradeEqualTo(7);
        return studentMapper.selectByExample(studentCriteria);
    }
}
