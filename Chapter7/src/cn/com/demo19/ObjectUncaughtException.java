package cn.com.demo19;

public class ObjectUncaughtException implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象异常处理");
    }
}
