package cn.com.demo12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    SimpleDateFormat sdf;
    Date date;
    public MyThread(SimpleDateFormat sdf,Date date){
       this.sdf=sdf;
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
