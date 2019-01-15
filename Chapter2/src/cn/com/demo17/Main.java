package cn.com.demo17;

/*
* 内置类中有两个同步方法，使用的是两把不同的锁，所以未同步
* */
public class Main {
    public static void main(String[] args){
        OuterClass.inner inner=new OuterClass.inner();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        });

        thread1.start();
        thread2.start();
    }
}
