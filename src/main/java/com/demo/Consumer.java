package com.demo;

import com.demo.dubbo.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by lubo3 on 2018/5/31.
 */
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer");
        System.out.println(userService.sayHi("lubo"));

    }
}
