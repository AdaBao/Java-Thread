package cn.com.demo16;

/*
* 解决ThreadLocal的get方法返回null问题
* */
public class Main {
    static ThreadLocalExt t=new ThreadLocalExt();
    public static void main(String[] args){
        System.out.println(t.get());
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t.get());
            }
        });
        thread.start();
    }
}
