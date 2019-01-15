package cn.com.demo10;

/*
* demo9的修正版
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.getSize());
    }
}
