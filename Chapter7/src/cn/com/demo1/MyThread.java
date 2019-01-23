package cn.com.demo1;

public class MyThread extends  Thread {
    public MyThread(){
        System.out.println("线程状态: "+this.getState());
    }
    @Override
    public void run(){
        System.out.println("线程状态: "+this.getState());
    }
}
