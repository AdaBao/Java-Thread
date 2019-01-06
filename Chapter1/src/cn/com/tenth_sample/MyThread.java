package cn.com.tenth_sample;

public class MyThread extends  Thread {
    @Override
    public void run(){
        while(true){
            if(this.isInterrupted()){
                System.out.println("MyThread is interrupted!");
                return;
            }

            System.out.println("timer: "+System.currentTimeMillis());
        }
    }
}
