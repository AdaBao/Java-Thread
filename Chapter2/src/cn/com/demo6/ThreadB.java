package cn.com.demo6;

public class ThreadB extends Thread{
    Service service;
    ThreadB(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        this.service.print();
    }
}
