package cn.com.demo4;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* TimerTask是以队列的方式一个一个被顺序(时间)性地执行,所以执行的时间有可能和预期的时间
* 不一样,因为前面的任务有可能消耗的时间较长,则后面的任务运行的时间也被延后
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar1=Calendar.getInstance();
        calendar1.add(Calendar.SECOND,5);
        Date runTime1=calendar1.getTime();
        System.out.println("计划运行时间: "+runTime1);
        calendar1.add(Calendar.SECOND,1);
        Date runTime2=calendar1.getTime();
        System.out.println("计划运行时间: "+runTime2);

        MyTask myTask1=new MyTask();
        MyTask myTask2=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask1,runTime1);
        timer.schedule(myTask2,runTime2);

    }
}
