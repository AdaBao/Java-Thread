package cn.com.demo8;

/*
* 虽然使用synchronized同步了代码块，但是对象监视器不是同一个对象，所以并不能实现同步
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
