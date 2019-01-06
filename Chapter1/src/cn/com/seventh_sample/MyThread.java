package cn.com.seventh_sample;

public class MyThread extends  Thread {
    @Override
    public void run(){
        System.out.println("MyThread start");
        int i=0;
        for(i=0; i<500000; i++)
        {
            if(this.isInterrupted()){
                System.out.println("MyThread stop");
                break;
            }
            System.out.println("i= "+i);
        }

        System.out.println("i= "+i);
        System.out.println("MyThread end");
    }
}
