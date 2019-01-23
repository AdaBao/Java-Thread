package cn.com.demo15;

public class MyThread extends  Thread{
    @Override
    public void run(){
        String str=null;
        System.out.println(str.hashCode());
    }
}
