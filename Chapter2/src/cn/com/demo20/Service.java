package cn.com.demo20;

public class Service {
    private  boolean isRunning=true;

    public void method(){
        while(isRunning){
            System.out.println("abcdef");
        }
        System.out.println("end");
    }

    public void setRunning(boolean isRunning){
        this.isRunning=isRunning;
    }
}
