package cn.com.demo2;

public class ThreadA extends  Thread {
    Object lock;
    public ThreadA(Object object){
        this.lock=object;
    }

    @Override
    public void run(){
        Service service=new Service();
        service.method1(lock);

    }
}
