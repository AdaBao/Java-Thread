package cn.com.demo11;

public class MyThread extends Thread {
    private int pos;
    volatile static private int addNumber=1;
    private Object lock;
    private char showChar;
    public MyThread(Object lock,char showChar,int pos){
        this.lock=lock;
        this.showChar=showChar;
        this.pos=pos;
    }

    @Override
    public void run(){
        synchronized (lock){
            while(true){
                while(addNumber%3!=pos) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(this.showChar);
                addNumber++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll();
            }
        }
    }
}
