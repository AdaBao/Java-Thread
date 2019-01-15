package cn.com.demo13;

public class Service {
    public void printA(){
        synchronized (Service.class){
            for(int i=0; i<10; i++){
                System.out.println("A"+" "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printB(){
        synchronized (Service.class){
            for(int i=0; i<10; i++){
                System.out.println("B"+" "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
