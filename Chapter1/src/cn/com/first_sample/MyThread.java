package cn.com.first_sample;

public class MyThread extends   Thread {

    private  int i;
    MyThread(int i){
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println(this.i);
    }
}
