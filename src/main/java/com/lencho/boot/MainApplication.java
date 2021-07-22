package com.lencho.boot;

import com.lencho.boot.bean.User;
import com.lencho.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Lencho
 * @create 2021-07-22 21:31
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        /*String[] names = run.getBeanDefinitionNames();

        Arrays.stream(names).forEach(name->{
            System.out.println(name);
        });*/

        User user = run.getBean("lencho", User.class);

        MyConfig config = run.getBean(MyConfig.class);
        User user1 = config.user();
        System.out.println(user == user1);
    }
}
