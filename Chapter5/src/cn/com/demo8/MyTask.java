package cn.com.demo8;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    int i;
    public MyTask(int i){
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println("任务"+this.i+"没有被cancel掉");
    }
}
