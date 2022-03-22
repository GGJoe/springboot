package com.guojiahe;

import com.guojiahe.controller.BookController;
import com.guojiahe.controller.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext q = SpringApplication.run(Springboot01Application.class, args);
        BookController bean = q.getBean(BookController.class);
        System.out.println("bean====>"+bean);
        User bean1 = q.getBean(User.class);
        System.out.println(bean1);
    }
}
