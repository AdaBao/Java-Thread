package cn.com.demo3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();

    public void awaitA(){
        try{
            lock.lock();
            System.out.println("awaitA begin at "+System.currentTimeMillis());
            condition.await();
            System.out.println("awaitA end at "+System.currentTimeMillis());
        }
        catch(InterruptedException ex){

        }
        finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try{
            lock.lock();
            System.out.println("awaitB begin at "+System.currentTimeMillis());
            condition.await();
            System.out.println("awaitB end at "+System.currentTimeMillis());
        }
        catch(InterruptedException ex){

        }
        finally {
            lock.unlock();
        }
    }

    public void signalAll(){
            lock.lock();
            condition.signalAll();
        System.out.println("调用signalAll");
            lock.unlock();
    }
}
