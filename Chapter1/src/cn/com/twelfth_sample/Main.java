package cn.com.twelfth_sample;

/*
* 测试yield方法，MyThread中添加yield方法之后，明显运行时间变长
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        myThread.start();

    }
}
