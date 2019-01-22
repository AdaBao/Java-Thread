package cn.com.demo3;

public class ThreadB extends Thread {
    Object lock;
    public ThreadB(Object lock){
        this.lock=lock;
    }

    @Override
    public void run(){
        Service service=new Service();
        service.method1(this.lock);
    }
}
