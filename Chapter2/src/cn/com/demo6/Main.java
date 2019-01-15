package cn.com.demo6;

/*
* synchronized同步语句块
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
