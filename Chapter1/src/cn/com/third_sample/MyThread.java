package cn.com.third_sample;

public class MyThread extends Thread  {
    int count=5;

    //synchronized关键字在此处的作用范围是类实例
    @Override
    public synchronized void run(){
        count--;
        System.out.println(Thread.currentThread().getName()+": count="+count);
    }
}
