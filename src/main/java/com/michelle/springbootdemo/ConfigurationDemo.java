package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {

    @Autowired
    private ConfigurationDemo configurationDemo;
    private BeanB beanB;

    @Autowired
    public ConfigurationDemo(BeanB beanB) {
        this.beanB = beanB;
    }

    @Bean
    public TransferService transferService() {
        return new TransferServiceImplA();
    }

    @Bean
    /**
     * TransferServiceImplA实例化的顺序影响TransferServiceImplA注入到B，所以参数可以先实例化transferService即具体类型为TransferServiceImplA
     */
    public TransferServiceImplB transferServiceImplB(TransferService transferService) {
        return new TransferServiceImplB();
    }


}
