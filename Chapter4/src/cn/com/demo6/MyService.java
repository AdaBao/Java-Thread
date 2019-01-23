package cn.com.demo6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private boolean hasValue=false;
    public void set(){
        lock.lock();
        while(hasValue){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("打印★");
        hasValue=true;
        condition.signalAll();
        lock.unlock();
    }

    public void get(){
        lock.lock();
        while(!hasValue){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("打印☆");
        hasValue=false;
        condition.signalAll();
        lock.unlock();
    }
}
