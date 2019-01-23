package cn.com.demo14;


/*
* 可以setUncaughtExceptionHandler方法给指定的线程对象设置异常处理器
* */
public class Main {
    public static void main(String[] args){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                String str=null;
                System.out.println(str.hashCode());
            }
        });
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程"+t.getName()+"抛异常了");
            }
        });
        thread.start();
    }
}
