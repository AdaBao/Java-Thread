package cn.com.eighth_sample;

public class MyThread extends  Thread {
    @Override
    public void run(){
        System.out.println("MyThread start");
        int i=0;
        try{
            for(i=0; i<500000; i++)
            {
                if(this.isInterrupted()){
                    System.out.println("MyThread stop");
                    throw new InterruptedException();

                }
                System.out.println("i= "+i);
            }
        }
        catch(InterruptedException ex){
            System.out.println("i= "+i);
            System.out.println("MyThread end");
            ex.printStackTrace();
        }

    }
}
