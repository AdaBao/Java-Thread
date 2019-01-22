package cn.com.demo6;


/*
* 多生产和多消费容易出现“假死”现象，解决办法是把notify改成notifyAll
* */
public class Main {
    public static void main(String[] args){
        ValueObject lock=new ValueObject();
        P p=new P(lock);
        C c=new C(lock);
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    p.setValue();
                }
            }
        });

        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    p.setValue();
                }
            }
        });


        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    p.setValue();
                }
            }
        });

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    c.getValue();
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    c.getValue();
                }
            }
        });

        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    c.getValue();
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
