package cn.com.demo4;

public class MyService {
    synchronized public void serviceMethod(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
