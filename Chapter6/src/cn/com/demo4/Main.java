package cn.com.demo4;


/*
* 使用DCL双检查锁机制,既保证了懒汉模式得到同一个实例对象,又提升了效率
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
