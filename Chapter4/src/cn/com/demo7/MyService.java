package cn.com.demo7;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock=new ReentrantLock();

    public void method1(){
        lock.lock();
        System.out.println("getHoldCount = "+lock.getHoldCount());
        this.method2();
        lock.unlock();
    }

    public void method2(){
        lock.lock();
        System.out.println("getHoldCount = "+lock.getHoldCount());
        lock.unlock();
    }
}
