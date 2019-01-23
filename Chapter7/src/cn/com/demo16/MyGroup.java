package cn.com.demo16;

public class MyGroup extends ThreadGroup {
    public MyGroup(String name) {
        super(name);
    }
    @Override
    public void uncaughtException(Thread t,Throwable e){
        System.out.println("MyGroup组内的线程 "+t.getName()+" 抛异常");
    }
}
