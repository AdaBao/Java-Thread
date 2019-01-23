package cn.com.demo10;

public class MyThread extends Thread {
    public MyThread(ThreadGroup group,String name){
        super(group,name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始了");
        while(!this.isInterrupted()){}
        System.out.println(Thread.currentThread().getName()+"结束了");
    }
}
