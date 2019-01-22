package cn.com.demo16;

//重写initialValue方法
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected  Object initialValue(){
        return "我是默认值 "+Thread.currentThread().getName()+",第一次get不再为null";
    }
}
