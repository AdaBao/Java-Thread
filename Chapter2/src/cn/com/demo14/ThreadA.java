package cn.com.demo14;

public class ThreadA extends Thread {
    Service service;
    public ThreadA(Service service){
        this.service=service;
    }

    @Override
    public void run(){
        this.service.printA();
    }
}
