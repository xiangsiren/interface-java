package com.nettys.api.jc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
//    public static void main(String[] args) {
//        ApplicationContext ctx =
//                new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//
////        helloWorld.setMessage("Hello World!");
////        helloWorld.getMessage();
//    }

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

//        TextEditor te = ctx.getBean(TextEditor.class);
//
//        te.spellCheck();
    }

}