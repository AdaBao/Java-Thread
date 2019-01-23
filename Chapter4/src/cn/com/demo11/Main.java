package cn.com.demo11;

/*
* hasWaiters(condition)的作用是查询是否有线程正在等待此锁有关的condition条件
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        Thread[] threads=new Thread[1000];
        for(int i=0; i<1000; i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    myService.await();
                }
            });
        }
        for(int i=0; i<1000; i++)
            threads[i].start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0; i<1000; i++)
            myService.signal();
    }
}
