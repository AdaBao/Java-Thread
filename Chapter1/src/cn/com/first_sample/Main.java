package cn.com.first_sample;

/*
* 一个简单的多线程小例子
* 可以看出执行start方法的顺序不代表线程启动的顺序
* 调用start方法会告诉系统线程已经就绪，但是不代表先就绪的线程就会被立马调用
* */
public class Main {
    public static void main(String[] args){
        System.out.println("up");
        MyThread thread1=new MyThread(1);
        MyThread thread2=new MyThread(2);
        MyThread thread3=new MyThread(3);
        MyThread thread4=new MyThread(4);
        MyThread thread5=new MyThread(5);
        System.out.println("down");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
