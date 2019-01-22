package cn.com.demo3;

public class ThreadA extends Thread {
    Object lock;
    public ThreadA(Object lock){
        this.lock=lock;
    }

    @Override
    public void run(){
        Service service=new Service();
        service.method1(this.lock);
    }
}
