package cn.com.seventh_sample;
/*
* 测试线程的isInterrupted方法，该方法测试
* 线程Thread对象是否已经是中断状态，但不清除状态标志
* 和interrupted方法不同，后者是静态方法，判断的是当前线程
* 是否是中断状态
*
* 在for循环中判断线程是否中断，用break结束for循环
* */
public class Main {
    public static void main(String[] args){
        System.out.println("Main start");
        MyThread thread=new MyThread();
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("Main end");
    }
}
