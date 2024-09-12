package com.example.jdbcex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoDAO {

    public String getTime(){
        String now = null;
        try(Connection connection = ConnectionUtil.INSTANCE.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select now()");
            ResultSet resultSet = preparedStatement.executeQuery();
            ) {
            resultSet.next();

            now = resultSet.getString(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return now;
    }
}
