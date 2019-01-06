package cn.com.twelfth_sample;

public class MyThread extends  Thread {
    @Override
    public void run(){
        int count=0;
        long begin=System.currentTimeMillis();
            for(int i=0; i<10000000; i++){
                //Thread.yield();
                count=count+i-10;
            }
        long end=System.currentTimeMillis();
        System.out.println("MyThread spend "+(end-begin)+" ms");
    }
}
