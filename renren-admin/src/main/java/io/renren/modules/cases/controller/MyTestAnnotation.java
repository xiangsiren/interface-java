package io.renren.modules.cases.controller;


import io.renren.common.annotation.SysLog;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTestAnnotation {

    String name() default "momo";
    int age() default 55 ;

}

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface people{
    game[] value();

}

@Repeatable(people.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface game{

    String value() default "" ;
}
