package com.sysoiev.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-injection.xml");
        CollectionInjection collectionInjection = (CollectionInjection) context.getBean("collectionInjection");
        collectionInjection.getDocumentList();
        collectionInjection.getDocumentSet();
        collectionInjection.getDocumentMap();
        collectionInjection.getDocumentProperties();
    }
}
