package cn.com.demo15;

/*
* 内部类测试，就是展示内部类是怎么code的，跟线程无关
* */
public class Main {
    public static void main(String[] args){
        PublicClass publicClass=new PublicClass();
        PublicClass.PrivateClass privateClass=publicClass.new PrivateClass();
        privateClass.print();
    }
}
