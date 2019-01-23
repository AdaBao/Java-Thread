package cn.com.demo5;

/*
* 实现生产生/消费者模式: 一对一交替打印
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<Integer.MAX_VALUE; i++)
                    myService.get();
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<Integer.MAX_VALUE; i++)
                    myService.set();
            }
        });

        thread1.start();
        thread2.start();
    }
}
