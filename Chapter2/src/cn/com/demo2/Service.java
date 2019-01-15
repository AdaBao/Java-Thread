package cn.com.demo2;

public class Service {
    synchronized public void serviceA(){
        serviceB();
        System.out.println("service a");
    }

    synchronized public void serviceB(){
        serviceC();
        System.out.println("service b");
    }

    synchronized public void serviceC(){
        System.out.println("service c");
    }
}
