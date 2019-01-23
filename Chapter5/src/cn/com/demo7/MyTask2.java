package cn.com.demo7;

import java.util.Date;
import java.util.TimerTask;

public class MyTask2 extends TimerTask {
    @Override
    public void run() {
        System.out.println("Task2 执行了,执行时间为: "+new Date());
    }
}
