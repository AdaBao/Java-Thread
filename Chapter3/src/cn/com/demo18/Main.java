package cn.com.demo18;

/*
* 使用类InheritableThreadLocal可以在子线程中取得父线程继承下来的值,也就是说在本例中,thread可以使用main线程
* 所绑定的值
* */
public class Main {
    static InheritableThreadLocalExt t=new InheritableThreadLocalExt();
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+" "+t.get());
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" "+t.get());
            }
        });
        thread.start();


        /*Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" "+t.get());
            }
        });
        thread.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" "+t.get());*/
    }
}
