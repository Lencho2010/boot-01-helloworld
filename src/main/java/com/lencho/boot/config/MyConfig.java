package com.lencho.boot.config;

import com.lencho.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Lencho
 * @create 2021-07-22 22:53
 */
@ImportResource("classpath:bean.xml")
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean("lencho")
    public User user(){
        return new User("李四",16);
    }
}
