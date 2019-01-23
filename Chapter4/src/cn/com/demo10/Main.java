package cn.com.demo10;

import java.util.Random;


/*
* hasQueuedThread(Thread thread)的作用是查询指定的线程是否正在等待获取此锁定
* hasQueuedThreads()的作用是查询是否有线程正在等待获取此锁定
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();

        Thread []threads=new Thread[1000];

        for(int i=0; i<threads.length; i++)
        {
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.method1(threads[new Random().nextInt(1000)]);
                }
            });
        }

        for(int i=0; i<threads.length; i++)
            threads[i].start();



    }
}
