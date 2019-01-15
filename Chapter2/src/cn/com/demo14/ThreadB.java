package cn.com.demo14;

public class ThreadB extends Thread {
    Service service;
    public ThreadB(Service service){
        this.service=service;
    }

    @Override
    public void run(){
        this.service.printB();
    }
}
