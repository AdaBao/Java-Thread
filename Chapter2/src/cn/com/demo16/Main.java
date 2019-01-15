package cn.com.demo16;

/*
* 测试静态内部类，此demo和线程无关
* */
public class Main {
    public static void main(String[] args){
        PublicClass.PrivateClass privateClass=new PublicClass.PrivateClass();
        privateClass.print();
    }
}
