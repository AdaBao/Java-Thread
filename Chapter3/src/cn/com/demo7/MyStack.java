package cn.com.demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyStack {
    private List list=new ArrayList();

    synchronized public void push(){
        if(list.size()==1) {
            try {
                System.out.println("生产者等待");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value=new Random().nextInt();
        list.add(value);
        System.out.println("生产者push "+value);
        this.notify();
    }

    synchronized  public void pop(){
        if(list.size()==0) {
            try {
                System.out.println("消费者等待");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value=(Integer)list.get(0);
        System.out.println("消费者pop "+value);
        list.remove(0);
        this.notify();
    }
}
