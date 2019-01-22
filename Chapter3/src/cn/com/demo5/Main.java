package cn.com.demo5;

/*
* 一个基本的生产者/消费者模式
* */
public class Main {
    public static void main(String[] args){
        ValueObject lock=new ValueObject();
        lock.value="";

        P p=new P(lock);
        C c=new C(lock);

        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                    p.setValue();
            }
        });

        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                    c.getValue();
            }
        });

        threadA.start();
        threadB.start();
    }
}
