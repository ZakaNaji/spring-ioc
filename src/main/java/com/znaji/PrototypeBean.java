package com.znaji;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    private static int instanceCount = 0;

    public PrototypeBean() {
        instanceCount++;
        System.out.println("PrototypeBean created! Instance count: " + instanceCount);
    }

    public void sayHello() {
        System.out.println("Hello from PrototypeBean, instance count: " + instanceCount);
    }
}
