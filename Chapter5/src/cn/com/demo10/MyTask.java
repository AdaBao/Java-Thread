package cn.com.demo10;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务开始,时间为: "+new Date());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务结束,时间为: "+new Date());
    }
}
