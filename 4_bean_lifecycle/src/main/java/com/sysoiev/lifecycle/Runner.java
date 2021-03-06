package com.sysoiev.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config-message-bean.xml");
        SimpleBean simpleBean = (SimpleBean) context.getBean("printMessage");
        System.out.println(simpleBean.getMessage());
        context.registerShutdownHook();
    }
}
