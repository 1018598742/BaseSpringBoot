package com.imooc.luckmoney;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 模版渲染
 */
@Controller
public class HelloController2 {

    @GetMapping("/hello2")
    public String say(){
        return "index";
    }
}
