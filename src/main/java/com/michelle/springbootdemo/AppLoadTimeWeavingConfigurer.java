package com.michelle.springbootdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.LoadTimeWeavingConfigurer;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;

/**
 * EnableLoadTimeWeaving注解会定义和注册多个ltw需要的基础bean，比如LoadTimeWeaver和AspectJWeavingEnabler等，
 * LoadTimeWeaver默认是DefaultContextLoadTimeWeaver，所以下面不需要再自定义LoadTimeWeaver
 * 要在jvm启动时增加参数：-javaagent:E:\minxue\software\maven\org\springframework\spring-instrument\5.1.5.RELEASE\spring-instrument-5.1.5.RELEASE.jar
 * 否则会报错，该参数指定织入时使用的agent即InstrumentationSavingAgent
 */
@Configuration
//@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
public class AppLoadTimeWeavingConfigurer /** implements LoadTimeWeavingConfigurer **/{
//    @Override
//    public LoadTimeWeaver getLoadTimeWeaver() {
////        InstrumentationLoadTimeWeaver loadTimeWeaver = new InstrumentationLoadTimeWeaver();
////        return loadTimeWeaver;
//        return new ReflectiveLoadTimeWeaver();
//    }
}
