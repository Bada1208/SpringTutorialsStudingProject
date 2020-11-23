package com.sysoiev.lifecycle;

public class SimpleBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void beanInit() {
        System.out.println("This method does initializing");
    }

    public void beanDestroy() {
        System.out.println("This method does destroying");
    }
}
