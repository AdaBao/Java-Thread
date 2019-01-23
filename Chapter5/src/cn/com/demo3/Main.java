package cn.com.demo3;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* Timer中允许有多个TimerTask任务
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar1=Calendar.getInstance();
        calendar1.add(Calendar.SECOND,5);
        Date runTime1=calendar1.getTime();
        System.out.println("计划运行时间: "+runTime1);
        calendar1.add(Calendar.SECOND,5);
        Date runTime2=calendar1.getTime();
        System.out.println("计划运行时间: "+runTime2);

        MyTask myTask1=new MyTask();
        MyTask myTask2=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask1,runTime1);
        timer.schedule(myTask2,runTime2);

    }
}
