package cn.com.demo10;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* 测试schedule方法任务延迟. 如果执行任务的时间有被延时,则下一次执行任务的开始
* 时间是以上一次任务"结束"时的时间作为参考来计算
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,1);
        Date runTime=calendar.getTime();
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask,runTime,1000);
    }
}
