package cn.com.demo4;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run()
    {
        System.out.println("任务执行了,时间为: "+new Date());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
