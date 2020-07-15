package io.renren.common.proxy;

import java.util.HashMap;
import java.util.Map;

public class Bye implements ByeInterface {

    @Override
    public void sayBye() {
        System.out.println("bababbab");
    }

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("name","dsffds");
        map.put("favor","girls");
        map.put("age","30岁");

    }
}
