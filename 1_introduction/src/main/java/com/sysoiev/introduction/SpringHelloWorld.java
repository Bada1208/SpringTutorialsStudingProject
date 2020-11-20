package com.sysoiev.introduction;

public class SpringHelloWorld {
    private String helloMessage;

    public void getHelloMessage() {
        System.out.println("Hello message: " + helloMessage);
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

}
