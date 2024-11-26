package com.znaji;

import org.springframework.stereotype.Component;

public class LifeCycleBean {

    public LifeCycleBean() {
        System.out.println("Constructor of LifeCycleBean");
    }

    public void init() {
        System.out.println("Init method of LifeCycleBean");
    }

    public void destroy() {
        System.out.println("Destroy method of LifeCycleBean");
    }

    public void print() {
        System.out.println("Print method of LifeCycleBean");
    }
}
