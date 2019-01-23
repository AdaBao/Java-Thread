package cn.com.demo8;

/*
* 使用enum枚举数据类型实现单例模式
* */
public class Main {
    public static void main(String[] args){
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.object1.getList().hashCode());
            }
        });

        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.object1.getList().hashCode());
            }
        });

        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.object1.getList().hashCode());
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
