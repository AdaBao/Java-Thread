package cn.com.demo7;

public class ThreadB extends Thread {
    Service service;
    ThreadB(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        this.service.print2();
    }
}
