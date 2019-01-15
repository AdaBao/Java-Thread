package cn.com.demo18;

/*
* 内置类和同步测试，运行结果是method1和method2是同步的
* */
public class Main {
    public static void main(String[] args){
        OutClass.InnerClass2 innerClass2=new OutClass.InnerClass2();
        OutClass.InnerClass1 innerClass1=new OutClass.InnerClass1();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1(innerClass2);
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method2();
            }
        });

        thread1.start();
        thread2.start();
    }
}
