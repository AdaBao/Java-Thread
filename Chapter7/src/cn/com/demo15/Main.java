package cn.com.demo15;

/*
* 可以使用setDefaultUnCaughtException方法对所有线程对象设置异常处理器
* */
public class Main {
    public static void main(String[] args){
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("MyThread的实例 线程 "+t.getName()+" 抛出异常了");
            }
        });

        MyThread myThread=new MyThread();
        myThread.start();
    }
}
