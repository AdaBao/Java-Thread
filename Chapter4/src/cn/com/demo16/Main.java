package cn.com.demo16;


/*
* 类ReentrantReadWriteLock的使用: 读写互斥
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.method1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.method2();
            }
        });
        thread1.start();
        thread2.start();
    }
}
