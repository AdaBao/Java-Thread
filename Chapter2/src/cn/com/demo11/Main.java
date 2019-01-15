package cn.com.demo11;

/*
* 静态同步synchronized方法
* */
public class Main {
    public static  void main(String[] args){
        ThreadA threadA=new ThreadA();
        ThreadB threadB=new ThreadB();

        threadA.start();
        threadB.start();
    }
}
