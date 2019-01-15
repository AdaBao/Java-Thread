package cn.com.demo12;

/*
* synchronized关键字分别加到static静态方法和非静态方法上
* 两个线程分别调用两个方法
* 根据结果可以知道两把锁不是同一把
* */
public class Main {
    public static  void main(String[] args){
        Service service=new Service();
        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);

        threadA.start();
        threadB.start();
    }
}
