package cn.com.demo13;

/*
* 使用synchronized(class)同步代码块
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();

        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);

        threadA.start();
        threadB.start();
    }
}
