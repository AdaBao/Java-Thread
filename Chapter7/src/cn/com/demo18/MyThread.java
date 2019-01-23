package cn.com.demo18;

public class MyThread extends Thread {
    public MyThread(ThreadGroup group,String name){
        super(group,name);
    }
    @Override
    public void run(){
        String str=null;
        System.out.println(str.hashCode());
    }
}
