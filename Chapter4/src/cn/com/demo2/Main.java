package cn.com.demo2;

/*
* 使用condition实现 等待/通知
* */
public class Main {
    public  static void main(String[] args){
        MyService myService=new MyService();

        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.await();
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                myService.signal();
            }
        });

        threadA.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
    }
}
