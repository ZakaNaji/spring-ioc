package com.znaji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private PrototypeBean prototypeBean;

    public SingletonBean() {
        System.out.println("SingletonBean created!");
    }

    public void sayHello() {
        getPrototypeBean().sayHello();
    }

    public void sayHelloAgain() {
        getPrototypeBean().sayHello(); // use the same prototype bean (not the desired behavior)
    }


    @Lookup
    public PrototypeBean getPrototypeBean() {
        return null;
    }
}
