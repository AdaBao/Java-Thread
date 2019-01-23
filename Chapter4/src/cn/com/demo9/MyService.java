package cn.com.demo9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
     ReentrantLock lock=new ReentrantLock();
     Condition condition=lock.newCondition();

    public void serviceMethod(){
        lock.lock();
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    public void signal(){
        lock.lock();
        System.out.println("getWaitQueueLength = "+lock.getWaitQueueLength(condition));
        condition.signal();
        lock.unlock();
    }
}
