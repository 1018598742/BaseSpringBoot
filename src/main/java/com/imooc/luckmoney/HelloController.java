package com.imooc.luckmoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    //    @GetMapping({"/say"})
//    @PostMapping("/say")
    @RequestMapping("/say")
    public String say() {
//        return "跟慕课网廖师兄学SpringBoot!";
        return "说明：" + limitConfig.getDescription();
    }

    /**
     * http://localhost:8081/luckmoney/hello/obtain/100
     */
    @RequestMapping("/obtain/{id}")
    public String obtain(@PathVariable("id") Integer id) {
        return "id:" + id;
    }

    /**
     * http://localhost:8081/luckmoney/hello/obtain2?id=100
     */
    @RequestMapping("/obtain2")
    public String obtain2(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id) {
        return "id:" + id;
    }
}
