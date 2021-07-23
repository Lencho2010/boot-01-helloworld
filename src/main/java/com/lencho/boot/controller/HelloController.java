package com.lencho.boot.controller;

import com.lencho.boot.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    public Pet pet;

    @RequestMapping("/pet")
    public String pet(){
        return pet.toString();
    }

    @GetMapping("/pet2")
    public String pet2(){
        Pet pet = new Pet();
        pet.setAge(2);
        pet.setName("毛毛");
        return pet.toString();
    }
}
