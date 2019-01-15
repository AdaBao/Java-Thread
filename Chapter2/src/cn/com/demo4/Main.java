package cn.com.demo4;

/*
* 当一个线程执行的代码出现异常时，其所持有的锁会自动释放
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA threadA=new ThreadA(service);
        threadA.start();
        ThreadB threadB=new ThreadB(service);
        threadB.start();
    }
}
