package cn.com.demo12;

/*
* isFair的作用是判断是不是公平锁
* isHeldByCurrentThread的作用是查询当前线程是否保持此锁定
* isLocked的作用是查询此锁定是否由任意线程保持
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        myService.serviceMethod();
    }

}
