package cn.com.demo7;

public class ThreadA  extends  Thread{
    Service service;
    ThreadA(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        this.service.print1();
    }
}
