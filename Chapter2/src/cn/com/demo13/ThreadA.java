package cn.com.demo13;

public class ThreadA extends  Thread {
    Service service;
    public ThreadA(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        this.service.printA();
    }
}
