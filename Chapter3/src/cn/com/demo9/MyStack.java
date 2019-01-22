package cn.com.demo9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyStack {
    private List list=new ArrayList();

    synchronized public void push(){
        while(list.size()==1) {
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
        this.notifyAll();
    }

    synchronized  public void pop(){
        while(list.size()==0) {
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
        this.notifyAll();
    }
}
