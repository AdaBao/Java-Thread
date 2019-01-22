package cn.com.demo3;

public class NotifyThread extends Thread {
    Object lock;
    public NotifyThread(Object lock){
        this.lock=lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            lock.notify();
            lock.notify();
            lock.notify();
            //lock.notifyAll();
        }
    }
}
