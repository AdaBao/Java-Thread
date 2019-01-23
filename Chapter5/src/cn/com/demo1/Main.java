package cn.com.demo1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* 执行任务的时间晚于当前时间-在未来执行的效果
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        MyTask myTask=new MyTask();
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runDate=calendar.getTime();

        Timer timer=new Timer();
        timer.schedule(myTask,runDate);
    }
}
