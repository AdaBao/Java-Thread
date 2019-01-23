package cn.com.demo8;

/*
* 线程组自动归属特性,自动归到当前线程组中
* */
public class Main {
    public static void main(String[] args){
        System.out.println("当前线程: "+Thread.currentThread().getName());
        System.out.println("线程组名字: "+Thread.currentThread().getThreadGroup().getName());
        System.out.println("当前线程组中活动的线程数量: "+Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("当前线程组中活动的线程组数量: "+Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("-----------------------------------------------------------------------------------");
        ThreadGroup group1=new ThreadGroup("A");//自动加到main组中
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("当前线程: "+Thread.currentThread().getName());
        System.out.println("线程组名字: "+Thread.currentThread().getThreadGroup().getName());
        System.out.println("当前线程组中活动的线程数量: "+Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("当前线程组中活动的线程组数量: "+Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("-----------------------------------------------------------------------------------");
        ThreadGroup[] groups=new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groups);//将当前线程组中的子线程组拷贝到另一个线程组中
        for(int i=0; i<groups.length; i++)
            System.out.println("线程组名: "+groups[i].getName());
    }
}
