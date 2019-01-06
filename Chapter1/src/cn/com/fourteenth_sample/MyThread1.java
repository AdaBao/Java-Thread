package cn.com.fourteenth_sample;

public class MyThread1 extends  Thread {
    @Override
    public void run(){
        for(int i=0; i<500000; i++){
            System.out.println("MyThread1 run");
        }
    }
}
