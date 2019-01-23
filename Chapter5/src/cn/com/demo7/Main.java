package cn.com.demo7;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* 和TimerTask类的cancel方法不同,Timer类中的cancel方法作用是将任务队列中全部的任务进行清空
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());

        Calendar calendar1=Calendar.getInstance();
        calendar1.add(Calendar.SECOND,2);
        Date runTime1=calendar1.getTime();
        System.out.println("task1计划运行时间: "+runTime1);
        Calendar calendar2=Calendar.getInstance();
        calendar2.add(Calendar.SECOND,3);
        Date runTime2=calendar2.getTime();
        System.out.println("task2计划运行时间: "+runTime2);
        MyTask1 myTask1=new MyTask1();
        MyTask2 myTask2=new MyTask2();

        Timer timer=new Timer();
        timer.schedule(myTask1,runTime1,1000);
        timer.schedule(myTask2,runTime2,1000);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();

    }
}
