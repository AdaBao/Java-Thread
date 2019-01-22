package cn.com.demo3;

public class ThreadC extends Thread {
    Object lock;
    public ThreadC(Object lock){
        this.lock=lock;
    }

    @Override
    public void run(){
        Service service=new Service();
        service.method1(this.lock);
    }
}
