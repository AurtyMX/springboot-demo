package com.michelle.springbootdemo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Configurable(preConstruction = true, autowire = Autowire.BY_NAME, dependencyCheck = true)
@Data
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class ConfigurableBeanDemo implements Serializable {
    @Autowired
    private BeanB beanB;
    private Long id;
    private String name;
}
