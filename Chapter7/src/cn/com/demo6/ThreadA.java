package cn.com.demo6;

public class ThreadA extends Thread {
    @Override
    public void run(){
        for(int i=0; i<Integer.MAX_VALUE; i++){
            System.out.println(this.getName()+" "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
