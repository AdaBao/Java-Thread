package cn.com.demo14;

/*
* 由于JVM中具有String常量池缓存的功能，所以不适合把String对象作为对象锁
* */
public class Main {
    public static void main(String[] args){
        String str1="AAAAA";
        String str2="AAAAA";
        System.out.println(str1==str2);
        Service service1=new Service(str1);
        Service service2=new Service(str2);
        ThreadA threadA=new ThreadA(service1);
        ThreadB threadB=new ThreadB(service2);

        threadA.start();
        threadB.start();
    }
}
