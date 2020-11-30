package com.sysoiev.spring_jdbc.dao;

import com.sysoiev.spring_jdbc.model.Developer;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDao {

    void setDataSource(DataSource dataSource);

    void createDeveloper(String name, String specialty, Integer experience);

    Developer getDeveloperById(Integer id);

    List listDevelopers();

    void removeDeveloper(Integer id);

    void updateDeveloper(Integer id, String name, String specialty, Integer experience);
}
