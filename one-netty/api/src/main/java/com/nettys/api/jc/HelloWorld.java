package com.nettys.api.jc;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        System.out.println("2222222222");
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}