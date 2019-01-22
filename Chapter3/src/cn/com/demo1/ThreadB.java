package cn.com.demo1;

public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object object){
        this.lock=object;
    }

    @Override
    public void run(){
        synchronized (lock){
            System.out.println("start ThreadB");
            for(int j=0; j<5; j++)
                System.out.println("j: "+j);
            lock.notify();
            System.out.println("end ThreadB");
        }
    }
}
