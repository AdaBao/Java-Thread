package cn.com.ninth_sample;

/*
* 测试使线程在沉睡中停止
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}
