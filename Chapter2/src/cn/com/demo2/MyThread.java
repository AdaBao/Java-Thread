package cn.com.demo2;

public class MyThread extends  Thread {
    Service service;

    MyThread(Service service){
        this.service=service;
    }

    @Override
    public void run(){
        this.service.serviceA();
    }
}
