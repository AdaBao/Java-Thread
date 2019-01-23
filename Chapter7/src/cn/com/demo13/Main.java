package cn.com.demo13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* 解决SimpleDateFormat非线程安全的办法是为每一个SimpleDateFormat创建一个实例,获得使用ThreadLocal(没code)
* */
public class Main {
    public  static void main(String[] args){

        Calendar calendar=Calendar.getInstance();
        Date date1=calendar.getTime();
        calendar.add(Calendar.SECOND,1);
        Date date2=calendar.getTime();

        MyThread myThread=new MyThread(date1);
        MyThread1 myThread1=new MyThread1(date2);


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
