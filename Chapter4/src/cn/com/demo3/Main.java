package cn.com.demo3;

/*
* 使用condition通知所有线程
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitA();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.awaitB();
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signalAll();
    }
}
