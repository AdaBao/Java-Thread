package cn.com.demo19;

/*
* 锁对象的改变，导致两个线程不同步
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });

        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
