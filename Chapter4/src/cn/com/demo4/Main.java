package cn.com.demo4;

/*
* 使用多个Condition实现通知部分线程
* 将线程分组,同组线程使用相同的condition,不同组的线程使用不同的condition
* */
public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitA();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitA();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitB();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitB();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signalA();
        myService.signalB();
    }
}
