package cn.com.demo13;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务开始,时间为: "+new Date());
        System.out.println("任务结束,时间为: "+new Date());
    }
}
