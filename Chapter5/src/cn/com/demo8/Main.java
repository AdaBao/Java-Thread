package cn.com.demo8;


import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* Timer类中的cancel方法有时并不一定会停止计划任务,原因是Timer类中的cancel方法有时并
* 没有争抢到queue锁,则让TimerTask类中的任务正常执行
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());

        Calendar calendar=Calendar.getInstance();
        Date runTime=calendar.getTime();

        for(int i=0; i<Integer.MAX_VALUE; i++){
        MyTask myTask=new MyTask(i);
        Timer timer=new Timer();
        timer.schedule(myTask, runTime);
        timer.cancel();
        }
    }
}
