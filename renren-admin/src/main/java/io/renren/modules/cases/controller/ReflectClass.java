package io.renren.modules.cases.controller;

import lombok.Data;

import java.lang.reflect.Method;

@Data
public class ReflectClass {


    public static void main(String[] args) {

        try {
            Class classbook = Class.forName("io.renren.modules.cases.controller.Book");

            Method declaredMethod = classbook.getDeclaredMethod("declaredMethod", int.class);

            Method[] dels = classbook.getDeclaredMethods();

            for (Method s: dels){
                System.out.println(s);
            }

//            declaredMethod.setAccessible(true);
//
//            Object newinstance = classbook.newInstance();
//
//            Book book = (Book) newinstance ;
//
//            String string = (String) declaredMethod.invoke(book,0);
//
//            System.out.println(string);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
