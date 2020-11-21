package com.sysoiev.container;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MessageRunnerWithBeanFactory {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("message-bean.xml"));
        Message message = (Message) factory.getBean("fromBeanMessage");
        message.getMessage();
    }
}
