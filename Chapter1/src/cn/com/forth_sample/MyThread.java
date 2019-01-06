package cn.com.forth_sample;

public class MyThread extends  Thread {
    MyThread(){
        System.out.println("begin: "+this.isAlive());
    }
    @Override
    public void run(){
        System.out.println("run: "+this.isAlive());

    }
}
