package com.sysoiev.spring_jdbc.util;

import com.sysoiev.spring_jdbc.model.Developer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeveloperMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Developer developer = new Developer();
        developer.setId(resultSet.getInt("id"));
        developer.setName(resultSet.getString("name"));
        developer.setSpecialty(resultSet.getString("specialty"));
        developer.setExperience(resultSet.getInt("experience"));
        return developer;
    }
}
