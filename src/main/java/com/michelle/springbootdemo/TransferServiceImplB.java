package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class TransferServiceImplB implements TransferService {
    @Autowired
    private TransferServiceImplA transferServiceImplA;

    @Override
    public void query() {

    }

    /**
     * close or shutdown method 自动被调用
     */
    public void close(){
        System.out.println("tranferservice B close!");
    }
}
