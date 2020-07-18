package com.nettys.server.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * netty 学习
 */

@Controller
public class NettyController {

    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("host","https://github.com/Inverseli/");
        return "index" ;
    }

    @RequestMapping("ren")
    @ResponseBody
    public String toTtest(){
        return "hell ren";
    }

    public static void main(String[] args) {

        f();
        System.out.println(TimeUnit.SECONDS);
    }

    private static void f() {
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
