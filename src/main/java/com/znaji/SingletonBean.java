package com.znaji;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private ObjectFactory<PrototypeBean> prototypeBeanObjectFactory;

    public SingletonBean() {
        System.out.println("SingletonBean created!");
    }

    public void sayHello() {
        final PrototypeBean prototypeBean = prototypeBeanObjectFactory.getObject();
        prototypeBean.sayHello();
    }

    public void sayHelloAgain() {
        final PrototypeBean prototypeBean = prototypeBeanObjectFactory.getObject();
        prototypeBean.sayHello();
    }

    @Autowired
    public void setPrototypeBeanObjectFactory(ObjectFactory<PrototypeBean> prototypeBeanObjectFactory) {
        this.prototypeBeanObjectFactory = prototypeBeanObjectFactory;
    }
}
