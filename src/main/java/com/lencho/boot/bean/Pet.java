package com.lencho.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Package: com.lencho.boot.bean
 * @ClassName: Pet
 * @Author: Lencho
 * @CreateTime: 2021/7/23 12:38
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "mypet")
public class Pet {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
