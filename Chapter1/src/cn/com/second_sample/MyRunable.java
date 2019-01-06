package cn.com.second_sample;

public class MyRunable implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
