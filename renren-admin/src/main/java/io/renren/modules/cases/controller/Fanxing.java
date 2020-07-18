package io.renren.modules.cases.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fanxing {
    // determines the largest of three Comparable objects

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

    public static void main(String[] args) {


        List<? extends Number> list2 = new ArrayList<Integer>();

        List<? extends Number> list3 = new ArrayList<Double>();

        List<? extends Number> list4 = new ArrayList<Number>();
        p2();

    }

    @MyTestAnnotation(name = "renern")
    public static void p2(){
        System.out.println("33");
    }

}