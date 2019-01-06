package cn.com.eleventh_sample;

public class MyThread extends  Thread {
    @Override
    public void run(){
        long i=0;
        while(true){
            i++;
            System.out.println(i);
        }
    }
}
