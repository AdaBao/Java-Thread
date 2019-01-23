package cn.com.demo14;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyService {
    ReadWriteLock lock=new ReentrantReadWriteLock();

    public void serviceMethod(){
        lock.readLock().lock();
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.readLock().unlock();
    }
}
