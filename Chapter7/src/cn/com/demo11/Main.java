package cn.com.demo11;

/*使线程具有有序性*/
public class Main {
    public static void main(String[] args){
        Object lock=new Object();
        MyThread myThread1=new MyThread(lock, 'A',1);
        MyThread myThread2=new MyThread(lock, 'B',2);
        MyThread myThread3=new MyThread(lock, 'C',0);

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
