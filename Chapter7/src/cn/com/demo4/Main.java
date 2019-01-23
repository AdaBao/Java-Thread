package cn.com.demo4;


/*
* 验证BLOCKED,BLOCKED状态出现在某一个线程在等待锁的时候
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethod();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethod();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.serviceMethod();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread1状态: "+thread1.getState());
        System.out.println("thread2状态: "+thread2.getState());
        System.out.println("thread3状态: "+thread3.getState());
    }
}
