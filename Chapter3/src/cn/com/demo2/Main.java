package cn.com.demo2;
/*
* 当interrupt方法遇到wait方法
* */
public class Main {
    public static void main(String[] args){
        Object lock=new Object();
        ThreadA threadA=new ThreadA(lock);
        threadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadA.interrupt();
    }
}
