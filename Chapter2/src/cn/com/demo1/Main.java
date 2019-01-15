package cn.com.demo1;

//脏读问题测试和解决
public class Main {
    public static void main(String[] args){
        PublicVar publicVar=new PublicVar();
        ThreadA threadA=new ThreadA(publicVar);
        ThreadB threadB=new ThreadB(publicVar);

        threadA.start();
        threadB.start();
    }
}
