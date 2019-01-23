package cn.com.demo13;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/*
* scheduleAtFixedRate方法具有执行追赶性,这就是和schedule的不同之处,将两个时间段内的时间所对应的Task任务被"补充性"地
* 执行,下面的例子中计划执行时间要早于当前时间,scheduleAtFixedRate方法会将计划时间和当前时间这一时间段内的任务补充执行
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前时间为: "+new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-5);
        Date runTime=calendar.getTime();
        System.out.println("计划执行时间为: "+runTime);
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(myTask,runTime,1000);
    }
}
