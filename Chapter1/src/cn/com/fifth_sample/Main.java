package cn.com.fifth_sample;

/*
* 测试getId方法,该方法返回线程的唯一标识
* */
public class Main {
    public static void main(String[] args){
        Thread currentThread=Thread.currentThread();
        System.out.println("Current Thread Name: "+currentThread.getName()+"\n"+"Current Thread Id: "+currentThread.getId());
    }
}
