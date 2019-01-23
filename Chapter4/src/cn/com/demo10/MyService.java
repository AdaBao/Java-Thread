package cn.com.demo10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    ReentrantLock lock=new ReentrantLock();
    Condition condition=lock.newCondition();


    public void method1(Thread thread){
        lock.lock();
        System.out.println("hasQueuedThread(thread1) = "+lock.hasQueuedThread(thread));
        System.out.println("hasQueuedThreads() = "+ lock.hasQueuedThreads());
        lock.unlock();
    }



}
