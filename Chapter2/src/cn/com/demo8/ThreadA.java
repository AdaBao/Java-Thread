package cn.com.demo8;

public class ThreadA extends Thread {
    Service service;

    public ThreadA(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        this.service.print();
    }
}
