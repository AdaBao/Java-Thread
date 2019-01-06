package cn.com.forth_sample;

/*
* 测试isAlive方法，isAlive方法测试线程是否处于活动状态
* */
public class Main {
    public static void main(String [] args){
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //下面的输出可能是false,也可能是true.因为myThread线程
        //可能已经结束也可能还没结束
        System.out.println("end: "+myThread.isAlive());
    }
}
