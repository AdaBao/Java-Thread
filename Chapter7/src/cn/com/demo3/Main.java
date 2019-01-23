package cn.com.demo3;

/*验证TIMED_WAITING*/
public class Main {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        myThread.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程状态: "+myThread.getState());
    }
}
