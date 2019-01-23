package cn.com.demo1;

/*
* 使用ReentrantLock类实现线程之间的同步
* */
public class Main {
    public static void main(String[] args){
        MyService myService=new MyService();
        MyThread[] threadArr=new MyThread[5];
        for(int i=0; i<threadArr.length; i++){
            threadArr[i]=new MyThread(myService);
        }
        for(int i=0; i<threadArr.length; i++)
        {
            threadArr[i].start();
        }

    }
}
