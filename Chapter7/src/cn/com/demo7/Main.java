package cn.com.demo7;

/*
* 线程对象关联线程组:多级关联
* */
public class Main {
    public static void main(String[] args){
        ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
        ThreadGroup group=new ThreadGroup(mainGroup,"A");

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread3");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1_=new Thread(mainGroup,thread1);
        Thread thread2_=new Thread(group,thread2);
       Thread thread3_=new Thread(group,thread3);

        thread1_.start();
        thread2_.start();
        thread3_.start();

        System.out.println("mainGroup活动的线程数为: "+mainGroup.activeCount());
        System.out.println("mainGroup活动的线程组数为: "+mainGroup.activeGroupCount());
        System.out.println("group活动的线程数为: "+group.activeCount());

    }
}
