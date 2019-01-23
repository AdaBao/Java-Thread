package cn.com.demo13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread1 extends Thread {
    SimpleDateFormat sdf;
    Date date;
    public MyThread1(Date date){
        sdf=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        this.date=date;
    }
    @Override
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName()+" "+sdf.format(date));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
