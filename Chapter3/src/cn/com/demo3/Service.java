package cn.com.demo3;

public class Service {
    public void method1(Object lock){
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+" start method1");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" end method1");
        }
    }
}
