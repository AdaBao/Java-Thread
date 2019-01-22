package cn.com.demo2;

public class Service {
    public void method1(Object lock){
        synchronized (lock){
            System.out.println("start");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                System.out.println("wait is interrupted!!!");
                e.printStackTrace();

            }
            System.out.println("end");
        }
    }
}
