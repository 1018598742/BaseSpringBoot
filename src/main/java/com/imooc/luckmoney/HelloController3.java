package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller + @ResponseBody = @RestController
 *
 */
@Controller
public class HelloController3 {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello3")
    @ResponseBody
    public String say() {
//        return "跟慕课网廖师兄学SpringBoot!";
        return "hello3说明：" + limitConfig.getDescription();
    }

    @GetMapping("/hello3_2")
    public String say2() {

        return "index";
    }
}
