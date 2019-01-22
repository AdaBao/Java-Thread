package cn.com.demo10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyStack {
    private List list=new ArrayList();

    synchronized public void push(){
        while(list.size()==1) {
            try {
                System.out.println("生产者等待 "+ Thread.currentThread().getName());
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value=new Random().nextInt();
        list.add(value);
        System.out.println("size "+list.size());
        System.out.println("生产者push "+value+" "+ Thread.currentThread().getName());
        this.notifyAll();
    }

    synchronized  public void pop(){
        while(list.size()==0) {
            try {
                System.out.println("消费者等待 "+ Thread.currentThread().getName());
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value=(Integer)list.get(0);
        System.out.println("size "+list.size());
        System.out.println("消费者pop "+value+" "+ Thread.currentThread().getName());
        list.remove(0);
        this.notifyAll();
    }
}
