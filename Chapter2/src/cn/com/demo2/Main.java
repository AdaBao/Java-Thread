package cn.com.demo2;

/*
* 测试锁重入，可以在synchronized方法/块的内部调用本类的其他synchronized方法/块
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread(new Service());
        myThread.start();
    }
}
