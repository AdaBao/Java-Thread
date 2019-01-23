package cn.com.demo12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* 从输出结果中可以发现,SimpleDateFormat是非线程安全的
* */
public class Main {
    public  static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        Calendar calendar=Calendar.getInstance();
        Date date1=calendar.getTime();
        calendar.add(Calendar.SECOND,1);
        Date date2=calendar.getTime();

        MyThread myThread=new MyThread(sdf,date1);
        MyThread1 myThread1=new MyThread1(sdf,date2);


        System.out.println(myThread.getName());
        System.out.println(date1);
        System.out.println(myThread1.getName());
        System.out.println(date2);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.start();
        myThread1.start();
    }
}
