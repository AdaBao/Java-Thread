package cn.com.demo6;

import java.util.Date;
import java.util.TimerTask;

public class MyTask1 extends TimerTask {
    @Override
    public void run() {
        System.out.println("Task1 执行了,执行时间为: "+new Date());
        this.cancel();
        System.out.println("Task1 取消");
    }
}
