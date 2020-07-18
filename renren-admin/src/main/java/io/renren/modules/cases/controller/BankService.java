package io.renren.modules.cases.controller;

import java.lang.reflect.Method;

public class BankService {


    @MyTestAnnotation()
    public static void TransferMoney(int money){
        System.out.println(processAnnotationMoney(money));

    }

    private static String processAnnotationMoney(int money) {
        try {
            Method transferMoney = BankService.class.getDeclaredMethod("TransferMoney",int.class);
            boolean annotationPresent = transferMoney.isAnnotationPresent(MyTestAnnotation.class);
            if(annotationPresent){
                MyTestAnnotation annotation = transferMoney.getAnnotation(MyTestAnnotation.class);
                int l = annotation.age();
                if(money>l){
                    return "转账金额大于限额，转账失败";
                }else {
                    return"转账金额为:"+money+"，转账成功";
                }
            }
        } catch ( NoSuchMethodException e) {
            e.printStackTrace();
        }
        return "转账处理失败";
    }
    public static void main(String[] args){
        TransferMoney(33);
    }
}
