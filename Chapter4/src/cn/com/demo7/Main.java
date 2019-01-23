package cn.com.demo7;
/*
* getHoldCount用于查询当前线程保持此锁定的个数,也就是调用lock方法的次数
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        myService.method1();
    }
}
