package cn.com.demo12;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    ReentrantLock lock=new ReentrantLock();

    public void serviceMethod(){
        lock.lock();
        System.out.println("isFair = "+lock.isFair());
        System.out.println("isHeldByCurrentThread = "+lock.isHeldByCurrentThread());
        System.out.println("isLocked = "+lock.isLocked());
        lock.unlock();
    }
}
