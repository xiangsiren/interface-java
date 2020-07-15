package io.renren.modules.sys.controller;

import org.testng.annotations.*;

public class Ren {


    public static void main(String[] args) {
        System.out.println("dfsdf");
    }


    @Test(enabled = false)
    public void test(){
        System.out.println("2222222");
    }
    @Test(groups = "server", enabled = false)
    public void test1(){

        System.out.println("3333333");
    }
    @Test(groups = "server")
    public void test2(){

        System.out.println("44444444");
    }
    @Test(groups = "client")
    public void test3(){

        System.out.println("5555555");
    }
    @Test(groups = "client")
    public void test4(){

        System.out.println("66666666");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforetest");
    }

    @AfterTest
    public void afterTest(){

        System.out.println("aftertest");
    }

    @BeforeMethod
    public void beforeMethond(){
        System.out.println("beforeMethond");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("afterMethod");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void AfterClass(){

        System.out.println("AfterClass");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("AfterSuite");
    }

    @BeforeGroups("server")
    public void BeforeGroups(){
        System.out.println("BeforeGroups");
    }

    @AfterGroups("server")
    public void AfterGroups(){

        System.out.println("AfterGroups");
    }
}
