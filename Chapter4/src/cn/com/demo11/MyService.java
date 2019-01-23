package cn.com.demo11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    ReentrantLock lock=new ReentrantLock();
    Condition condition=lock.newCondition();

    public void await(){
        lock.lock();
        try {
            System.out.println("hasWaiters = "+lock.hasWaiters(condition));
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    public void signal(){
        lock.lock();
        condition.signal();
        lock.unlock();
    }
}
