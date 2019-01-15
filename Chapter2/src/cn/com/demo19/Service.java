package cn.com.demo19;

public class Service {
    String lock="123";
    public  void method1(){
        //下面的同步代码所持有的锁是"123"，在lock修改为"456"之后
        //下面的代码所持有的锁依旧是"123"，但是第二个线程在尝试进入
        //同步代码块时，持有的锁是"456"，所以两个线程之间不能同步
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+" start");
            lock="456";
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" end");
        }
    }

}
