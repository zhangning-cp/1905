package com.xcy.a.springboot2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloSpring2 {

    @RequestMapping("/hello")
    @ResponseBody
    public String show(){
        return "6哒5555555555";
    }

}
