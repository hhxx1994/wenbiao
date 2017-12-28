package com.wenbiao.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hhx
 * @date 2017/12/28 17:01
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "HelloWorld";

    }

}
