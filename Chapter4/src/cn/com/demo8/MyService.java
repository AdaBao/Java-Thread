package cn.com.demo8;


import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    ReentrantLock lock=new ReentrantLock();
    public void serviceMethod(){
        lock.lock();
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
