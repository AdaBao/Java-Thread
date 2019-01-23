package cn.com.demo2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* 如果执行任务的时间早于当前时间,则立即执行Task任务
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-10);
        Date runTime=calendar.getTime();
        System.out.println("计划执行时间为: "+runTime);
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask,runTime);
    }
}
