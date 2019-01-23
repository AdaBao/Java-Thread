package cn.com.demo6;

/*
* 实现生产者/消费者模式:多对多交替打印
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();

        Thread threadA1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                myService.set();
            }
        });
        Thread threadA2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                myService.set();
            }
        });

        Thread threadB1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                myService.get();
            }
        });
        Thread threadB2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                myService.get();
            }
        });

        threadA1.start();
        threadA2.start();
        threadB1.start();
        threadB2.start();
    }
}
