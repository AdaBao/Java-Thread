package cn.com.thirteenth_sample;

/*
* 测试线程优先级的设置，线程优先级具有继承特性
* 比如说A线程启动了B线程，则B线程的优先级与A是一样的
* */
public class Main {
    public static void main(String[] args){
        System.out.println("main priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("main priority: "+Thread.currentThread().getPriority());
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
    }
}
