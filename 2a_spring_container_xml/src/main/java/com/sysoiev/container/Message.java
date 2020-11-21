package com.sysoiev.container;

public class Message {
    private String message;

    public void getMessage() {
        System.out.println("Hello message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
