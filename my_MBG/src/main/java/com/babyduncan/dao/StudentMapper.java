package com.babyduncan.dao;

import com.babyduncan.model.Student;
import com.babyduncan.model.StudentCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    long countByExample(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    int deleteByExample(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    List<Student> selectByExampleWithBLOBsWithRowbounds(StudentCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    List<Student> selectByExampleWithBLOBs(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    List<Student> selectByExampleWithRowbounds(StudentCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    List<Student> selectByExample(StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Student record, @Param("example") StudentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Wed Jan 10 21:45:05 CST 2018
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentCriteria example);

    long countDistinctAgeByExample(StudentCriteria example);
}