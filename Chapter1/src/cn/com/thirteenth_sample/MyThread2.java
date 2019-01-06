package cn.com.thirteenth_sample;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread2 priority: "+this.getPriority());
    }
}
