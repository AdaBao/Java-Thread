package cn.com.demo5;

public class MyThread extends Thread {
    @Override
    synchronized public void run(){
        System.out.println("wait开始");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
