package cn.com.demo21;
/*
* 从这个例子中可以看出volatile不能保证变量操作在多个线程之间的同步性
* */
public class Main{
    public static void main(String[] args){
        Service service=new Service();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread5=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
