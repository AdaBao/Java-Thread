package cn.com.demo1;

/*
* 简单的wait/notify的demo
* */
public class Main {
    public static void main(String[] args){
        Object lock=new Object();
        ThreadA threadA=new ThreadA(lock);
        ThreadB threadB=new ThreadB(lock);
        threadA.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
    }
}
