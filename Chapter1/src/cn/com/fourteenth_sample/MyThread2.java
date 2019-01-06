package cn.com.fourteenth_sample;

public class MyThread2 extends  Thread {
    @Override
    public void run(){
        for(int i=0; i<500000; i++){
            System.out.println("MyThread2 run");
        }
    }
}
