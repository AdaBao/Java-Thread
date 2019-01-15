package cn.com.demo20;

/*
* 这个demo并未达到预期效果
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method();
            }
        });

        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        service.setRunning(false);

    }
}
