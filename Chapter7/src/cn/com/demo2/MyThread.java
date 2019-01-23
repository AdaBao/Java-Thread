package cn.com.demo2;

public class MyThread extends  Thread {
    @Override
    public void run(){
        System.out.println("begin sleep");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end sleep");
    }
}
