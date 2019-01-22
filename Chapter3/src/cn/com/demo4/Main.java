package cn.com.demo4;

/*
* wait(long)方法的功能是等待某一时间内是否有线程对锁进行唤醒，如果超过这个时间则自动唤醒
* */
public class Main {
    public static void main(String[] args){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                Object lock=new Object();
                synchronized (lock){
                    System.out.println("begin time "+System.currentTimeMillis());
                    try {
                        lock.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("end time "+System.currentTimeMillis());

                }
            }
        });
        thread.start();
    }
}
