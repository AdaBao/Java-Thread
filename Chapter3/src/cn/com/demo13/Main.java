package cn.com.demo13;

/*简单测试join方法
* 使主线程等待子线程执行完成之后再结束
* */
public class Main {
    public static void main(String[] args){
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("ThreadA start");
                    Thread.sleep(2000);
                    System.out.println("ThreadA end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadA 结束,程序回到主线程中");
    }
}
