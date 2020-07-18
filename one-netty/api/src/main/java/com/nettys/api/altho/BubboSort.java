package com.nettys.api.altho;

import java.util.Arrays;

public class BubboSort {


    //选择排序
    public static int[] sorts(int[] arr){

        int[] arrs = Arrays.copyOf(arr, arr.length);

        for (int i= 0 ; i < arrs.length; i++){

            for (int j=i+1; j< arrs.length ; j++){
                if (arrs[i] > arrs[j]){
                    int tmp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = tmp ;
                }

            }
            System.out.println(arrs[i]);
        }

        return arrs ;
    }


    //冒泡排序
    public static int[] sortss(int[] arr){

        int[] arrs = arr ;//Arrays.copyOf(arr, arr.length);

        for (int i= 1 ; i < arrs.length; i++){

            boolean flag = true;

            for (int j=0; j< arrs.length - i ; j++){
                if (arrs[j] > arrs[j + 1]){
                    int tmp = arrs[j + 1];
                    arrs[j + 1] = arrs[j];
                    arrs[j] = tmp ;
                    flag = false ;
                }
            }
            if (flag == true){
                break;
            }

        }

        return arrs ;
    }

    //插入排序
    public static int[] InsertSort(int[] arr){

        int[] arrs = Arrays.copyOf(arr, arr.length) ;

        for (int i = 1; i < arrs.length; i++){


            for (int j= i; j >0; j--){
                if (arrs[j] < arrs[j-1]){

                    int tmp = arrs[j];
                    arrs[j]  = arrs[j-1];
                    arrs[j-1] = tmp ;
                }
            }
        }

        return arrs ;
    }
    public  static void main(String[] args) throws Exception{

        int[] arr = {99, 55, 44, 46} ;

        System.out.println(arr.length);
        int[] tmp = InsertSort(arr);
        for (int i: tmp){
            System.out.print(i + " ");
        }
    }
}
