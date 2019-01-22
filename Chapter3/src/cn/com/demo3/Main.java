package cn.com.demo3;

/*
* notify每次只能随机地唤醒一个进程，但是notify可以多次调用以唤醒所有的进程,或者也可以使用notifyAll
* */
public class Main {
    public static void main(String[] args){
        Object lock=new Object();
        ThreadA threadA=new ThreadA(lock);
        ThreadB threadB=new ThreadB(lock);
        ThreadC threadC=new ThreadC(lock);
        NotifyThread nt=new NotifyThread(lock);

        threadA.start();
        threadB.start();
        threadC.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        nt.start();
    }
}
