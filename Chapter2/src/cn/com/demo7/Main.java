package cn.com.demo7;

/*
* 当一个线程访问object的一个synchronized(this)同步代码块时，
* 其他线程对同一个object中的所有其他synchronized(this)同步代码块的访问
* 将被阻塞
* */
public class Main {
    public  static void main(String[] args){
        Service service=new Service();

        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);


        threadA.start();
        threadB.start();

    }
}
