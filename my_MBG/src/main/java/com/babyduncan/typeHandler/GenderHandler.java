package com.babyduncan.typeHandler;

import com.babyduncan.Gender;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * CREATE BY guohaozhao AT 2017/11/16
 **/
public class GenderHandler implements TypeHandler<Gender> {

    public void setParameter(PreparedStatement preparedStatement, int i, Gender gender, JdbcType jdbcType) throws SQLException {
        preparedStatement.setBoolean(i, gender.getValue() == 1);
    }

    public Gender getResult(ResultSet resultSet, String s) throws SQLException {
        return resultSet.getBoolean(s) ? Gender.MALE : Gender.FEMALE;
    }

    public Gender getResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getBoolean(i) ? Gender.MALE : Gender.FEMALE;
    }

    public Gender getResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getBoolean(i) ? Gender.MALE : Gender.FEMALE;
    }
}
