package cn.com.demo5;


/*
* 使用静态内置类实现单例模式
* */
public class Main {
    public static void main(String[] args){

        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });

        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });

        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();

    }
}
