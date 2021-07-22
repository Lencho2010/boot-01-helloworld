package com.lencho.boot.config;

import com.lencho.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lencho
 * @create 2021-07-22 22:53
 */
@Configuration(proxyBeanMethods = false)
public class MyConfig {

    @Bean("lencho")
    public User user(){
        return new User("lisi",16);
    }
}
