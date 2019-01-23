package cn.com.demo17;

/*
* 对象的异常处理器会先于类的异常处理器捕获异常
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        MyThread.setDefaultUncaughtExceptionHandler(new StaticUncaughtException());
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtException());
        myThread.start();
    }
}
