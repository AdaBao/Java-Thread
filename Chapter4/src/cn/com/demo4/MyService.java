package cn.com.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition1=lock.newCondition();
    private Condition condition2=lock.newCondition();

    public void awaitA(){
        try{
            lock.lock();
            System.out.println("awaitA begin at "+System.currentTimeMillis());
            condition1.await();
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
            condition2.await();
            System.out.println("awaitB end at "+System.currentTimeMillis());
        }
        catch(InterruptedException ex){

        }
        finally {
            lock.unlock();
        }
    }

    public void signalA(){
        lock.lock();
        condition1.signalAll();
        System.out.println("signal all A");
        lock.unlock();
    }

    public void signalB(){
        lock.lock();
        condition2.signalAll();
        System.out.println("signal all B");
        lock.unlock();
    }
}
