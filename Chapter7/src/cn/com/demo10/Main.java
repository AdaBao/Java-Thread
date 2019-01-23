package cn.com.demo10;

/*
* 组内的线程批量停止
* */
public class Main {
    public static void main(String[] args){
        ThreadGroup group=new ThreadGroup("A");
        MyThread[] threads=new MyThread[5];
        for(int i=0; i<5; i++){
            threads[i]=new MyThread(group,i+"");
            threads[i].start();
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("调用了interrupt");
        group.interrupt();

    }

}
