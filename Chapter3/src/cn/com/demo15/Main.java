package cn.com.demo15;

/*
* 类ThreadLocal解决的是变量在不同线程间的隔离性,也就是不同线程
* 拥有自己的值,不同线程中的值是可以放入ThreadLocal类中进行保存的
* */
public class Main {
    public static  ThreadLocal t=new ThreadLocal();
    public static void main(String[] args){
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t.get());
                t.set("A");
                System.out.println(t.get());
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t.get());
                t.set("B");
                System.out.println(t.get());
            }
        });

        threadA.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.get());
        t.set("Main");
        System.out.println(t.get());
    }
}
