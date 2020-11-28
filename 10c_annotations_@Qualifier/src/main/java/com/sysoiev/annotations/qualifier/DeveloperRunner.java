package com.sysoiev.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");
        Position position = (Position) context.getBean("position");
        position.getDevelopersInfo();
    }
}
