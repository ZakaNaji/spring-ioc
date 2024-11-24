package com.znaji;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println("Calling sayHello() on singletonBean1");
        singletonBean1.sayHello();
        System.out.println("Calling sayHelloAgain() on singletonBean1");
        singletonBean1.sayHelloAgain();
    }
}