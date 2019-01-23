package cn.com.demo18;

public class MyGroup extends ThreadGroup {
    public MyGroup(String name) {
        super(name);
    }
    @Override
    public void uncaughtException(Thread t,Throwable throwable){
        System.out.println("线程组捕获异常");
    }
}
