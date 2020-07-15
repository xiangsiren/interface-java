package io.renren.controller;

import org.testng.annotations.Test;

public class ExpectExpection {


    @Test(expectedExceptions = RuntimeException.class)
    public void runs(){

        System.out.println("this is error");

        throw new RuntimeException();
    }
}
