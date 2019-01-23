package cn.com.demo19;

public class StaticUncaughtException implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
    }
}
