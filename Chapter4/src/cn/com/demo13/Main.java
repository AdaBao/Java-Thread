package cn.com.demo13;

public class Main {
    public static void main(String[] args){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread thread1=new Thread(thread);
        thread1.start();
        System.out.println(thread1.getName());
    }
}
