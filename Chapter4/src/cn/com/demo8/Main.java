package cn.com.demo8;

/*
* getQueueLength返回正在等待此锁的线程数
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();

        Thread []threads=new Thread[1000];
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

        System.out.println(myService.lock.getQueueLength());
    }
}
