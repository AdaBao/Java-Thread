package cn.com.demo14;

/*
* 类ReentrantReadWriteLock的使用: 读读共享
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

        thread1.start();
        thread2.start();
    }
}
