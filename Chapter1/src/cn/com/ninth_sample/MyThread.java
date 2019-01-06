package cn.com.ninth_sample;

public class MyThread extends  Thread {
    @Override
    public void run(){
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("MyThread is interrupted!");
            e.printStackTrace();
        }
    }

}
