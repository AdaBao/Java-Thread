package cn.com.demo11;

public class ThreadB extends Thread {
    @Override
    public void run(){
        Service.printB();
    }
}
