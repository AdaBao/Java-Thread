package cn.com.tenth_sample;


/*
* 测试使用return的方法停止线程
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
