package cn.com.sixth_sample;

/*
* 测试interrupt方法，该方法并不能真的停止线程
* 只是打了个线程停止的标记
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("------------------------------------------------------------------");
    }
}
