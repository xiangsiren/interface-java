package io.renren.controller;

import org.testng.annotations.Test;

public class Parameters {

    @Test
    @org.testng.annotations.Parameters({"name","age"})
    public void pa(String name,int age){

        System.out.println("name = " + name + " age = " + age);

    }
}
