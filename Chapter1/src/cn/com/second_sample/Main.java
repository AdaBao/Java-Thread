package cn.com.second_sample;

/*
* 使用实现Runable接口的方式创建线程
* */
public class Main {
    public static void main(String[] args){
        Runnable runable=new MyRunable();
        Thread thread=new Thread(runable);
        thread.start();
    }
}
