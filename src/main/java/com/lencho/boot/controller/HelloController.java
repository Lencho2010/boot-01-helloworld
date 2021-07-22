package com.lencho.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-07-22 21:34
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "hello,spring boot2!!!";
    }
}
