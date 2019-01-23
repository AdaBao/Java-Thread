package cn.com.demo9;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* 测试schedule方法任务不延迟. 如果执行任务的时间没有被延时,则下一次执行任务的开始
* 时间是上一次任务的开始时间加上period时间
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,1);
        Date runTime=calendar.getTime();
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask,runTime,3000);
    }
}
