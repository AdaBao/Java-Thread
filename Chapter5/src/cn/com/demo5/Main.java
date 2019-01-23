package cn.com.demo5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* schedule(TimerTask task, Date firstTime, long period) 在指定的日期之后按指定的间隔周期,无限循环地执行某一任务
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar1=Calendar.getInstance();
        calendar1.add(Calendar.SECOND,5);
        Date runTime1=calendar1.getTime();
        System.out.println("计划运行时间: "+runTime1);


        MyTask myTask1=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask1,runTime1,1000);


    }
}
