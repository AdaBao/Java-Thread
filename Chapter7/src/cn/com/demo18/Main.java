package cn.com.demo18;

/*
* 对象的异常处理器会先于类的异常处理器和对象组异常处理器捕获异常
* */
public class Main {
    public static void main(String[] args){
        MyGroup group=new MyGroup("我的线程组");
        MyThread myThread=new MyThread(group,"我的线程");
        MyThread.setDefaultUncaughtExceptionHandler(new StaticUncaughtException());
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtException());
        myThread.start();
    }
}
