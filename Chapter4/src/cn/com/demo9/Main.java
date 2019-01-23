package cn.com.demo9;

/*
* 方法getWaitQueueLength(Condition condition)的作用是返回等待与此锁
* 相关的给定条件Condition的线程估计数
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        Thread threads[]=new Thread[1000];
        for(int i=0; i<threads.length; i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.serviceMethod();
                }
            });
        }

        for(int i=0; i<threads.length; i++){
            threads[i].start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signal();

        //java.lang.IllegalMonitorStateException
        //System.out.println(myService.lock.getWaitQueueLength(myService.condition));
    }
}
