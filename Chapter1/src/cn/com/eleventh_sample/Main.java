package cn.com.eleventh_sample;

/*
* 测试suspend方法，main函数中的"main end"大概率不会输出
*  public void println(String x) {
        synchronized (this) {
            print(x);
            newLine();
        }
    }
    System.out.println()方法内部持有PrintStream对象锁
    当调用MyThread的suspend方法时，MyThread这个线程大概率在
    synchronized的块中，锁得不到释放，而main函数要一直等待锁的释放
* */
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.suspend();
        System.out.println("main end");
    }
}
