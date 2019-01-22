package cn.com.demo1;

public class ThreadA extends  Thread {
    private Object lock;
    public ThreadA(Object object){
        this.lock=object;
    }

    @Override
    public void run(){
        synchronized (lock){
            System.out.println("start ThreadA");
            for(int i=0; i<10; i++){
                if(i!=5)
                    System.out.println("i: "+i);
                else{
                    try {
                        lock.wait();
                        System.out.println("i: 5");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("end ThreadA");
        }
    }
}
