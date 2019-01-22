package cn.com.demo14;

/*
* join(long)会释放锁,sleep(long)不会释放锁
* */
public class Main {
    public static void main(String[] args){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程开始");
                for(int i=0; i<Integer.MAX_VALUE; i++){
                    Math.random();
                }
                System.out.println("子线程结束");
            }
        });
        thread.start();
        try {
            //主线程wait(3000),3000ms后主线程继续
            thread.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
