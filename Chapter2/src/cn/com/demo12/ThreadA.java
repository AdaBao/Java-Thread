package cn.com.demo12;

public class ThreadA extends Thread {
    Service service;
    ThreadA(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        service.printA();
    }
}
