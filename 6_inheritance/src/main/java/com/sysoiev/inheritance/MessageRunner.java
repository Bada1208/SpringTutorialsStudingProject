package com.sysoiev.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-config.xml");
        Message message = (Message) context.getBean("message");
        System.out.println("First bean:");
        System.out.println(message.getMessage());
        System.out.println("====================");
        MessageToYou messageToYou = (MessageToYou) context.getBean("messageToYou");
        System.out.println("Second bean:");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());
    }
}
