package cn.com.demo11;

public class ThreadA extends Thread {
    @Override
    public void run(){
        Service.printA();
    }
}
