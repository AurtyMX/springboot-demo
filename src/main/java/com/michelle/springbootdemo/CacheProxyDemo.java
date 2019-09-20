package com.michelle.springbootdemo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheProxyDemo {

//    @Cacheable("CacheProxyDemo")
    public String test1(int i) {
        System.out.println("CacheProxyDemo test 1 start...");
        return "test" + i;
    }

    /**
     * 不能使用test1的缓存，因为是通过this而不是代理，但据说cglib实现的代理即使是this也可以，而在这里CacheProxyDemo是class而不是接口，所以使用cglib实现的代理
     * 但为什么不可以呢，应该是为了跟java的代理保持一致,java代理不能对this调用重写，否则this调用出现我用接口即java代理和用类即用cglib代理得到的结果不一样，会很奇怪。
     * @param i
     * @return
     */
    public String test2(int i) {
        System.out.println("CacheProxyDemo test 2 start...");
        return test1(i);
    }
}
