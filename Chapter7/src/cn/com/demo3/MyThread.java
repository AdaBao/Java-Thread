package cn.com.demo3;

public class MyThread extends Thread {
    @Override
    synchronized public void run(){
        System.out.println("wait开始");
        try {
            this.wait(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
