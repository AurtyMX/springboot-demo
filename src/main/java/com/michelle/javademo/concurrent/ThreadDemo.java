package com.michelle.javademo.concurrent;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

    /**
     * 如果callable中方法抛出异常，没调用future.get不能捕获异常，同时future会被标识为已完成
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new FutureTask(-1));
        TimeUnit.SECONDS.sleep(1);
//        future.get();
        Assert.assertEquals(false, future.isDone());

    }

    /**
     * 测试守护线程的主线程是否是jvm主线程。结果虽然child thread是在parent thread里创建的，但他依附的主线程是main即jvm主线程
     */
    @Test
    public void test2() throws Exception {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " running!");
            Thread childT1 = new Thread(() -> {
                while (1 == 1) {
                    System.out.println(Thread.currentThread().getName() + " running!");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            });
            childT1.setName("child thread");
            childT1.setDaemon(true);
            childT1.start();
        });
        t1.setName("parent thread");
        t1.start();
        TimeUnit.SECONDS.sleep(20);
    }


    class FutureTask implements Callable<Integer> {
        private int parameter;

        private FutureTask(int parameter) {
            this.parameter = parameter;
        }

        @Override
        public Integer call() throws Exception {
            System.out.println("parameter:" + parameter);
            if (parameter <= 0) {
                throw new IllegalArgumentException("parameter is invalid!");
            }
            return parameter;
        }
    }
}
