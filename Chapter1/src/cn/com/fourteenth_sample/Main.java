package cn.com.fourteenth_sample;

/*
* 测试线程优先级，从代码中可以得知,优先级高并且先
* start的，不一定就会全部的绝对的先执行
* */

public class Main {
    public static void main(String[] args){
        MyThread1 myThread1=new MyThread1();
        MyThread2 myThread2=new MyThread2();

        myThread1.setPriority(1);
        myThread2.setPriority(2);


        myThread2.start();
        myThread1.start();
    }
}
