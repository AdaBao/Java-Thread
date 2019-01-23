package cn.com.demo2;

import java.util.Date;
import java.util.TimerTask;

public class MyTask  extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了,执行时间为: "+new Date());
    }
}
