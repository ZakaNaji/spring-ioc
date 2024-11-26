package com.znaji;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }
}
