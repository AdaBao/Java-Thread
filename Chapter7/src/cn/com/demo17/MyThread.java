package cn.com.demo17;

public class MyThread extends Thread {
    @Override
    public void run(){
        String str=null;
        System.out.println(str.hashCode());
    }
}
