package cn.com.demo6;

/*
* 线程对象关联线程组: 1级关联
* */
public class Main {
    public static void main(String[] args){
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();

        ThreadGroup threadGroup=new ThreadGroup("线程组1");

        Thread thread1=new Thread(threadGroup,threadA);
        Thread thread2=new Thread(threadGroup,threadB);

        thread1.start();
        thread2.start();

        System.out.println("活动的线程数为: "+threadGroup.activeCount());
        System.out.println("线程组的名称为: "+threadGroup.getName());
    }
}
