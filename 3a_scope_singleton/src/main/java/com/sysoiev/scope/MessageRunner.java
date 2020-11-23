package com.sysoiev.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("message-bean.xml");
        Message message = (Message) context.getBean("printMessage");
        message.setMessage("This is first object");
        System.out.println(message.getMessage());

        Message secondMessage = (Message) context.getBean("printMessage");
        System.out.println(secondMessage.getMessage());
    }
}
