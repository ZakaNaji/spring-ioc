package com.znaji;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
}
