package com.sysoiev.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunnerWithXmlFileSystemApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "file:\\C:\\Users\\Admin\\IdeaProjects\\SpringTutorialsStudingProject\\2b_spring_container_fileclasspathxmlconfig\\src\\main\\resources\\message-bean.xml");
        Message message = (Message) context.getBean("fromBeanMessage2");
        System.out.println(message.getMessage());
    }
}
