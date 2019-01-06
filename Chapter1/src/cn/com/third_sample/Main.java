package cn.com.third_sample;

/*
* 多线程之间共享数据
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        Thread thread1=new Thread(myThread);
        Thread thread2=new Thread(myThread);
        Thread thread3=new Thread(myThread);
        Thread thread4=new Thread(myThread);
        Thread thread5=new Thread(myThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
