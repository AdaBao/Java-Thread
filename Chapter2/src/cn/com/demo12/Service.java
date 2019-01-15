package cn.com.demo12;

public class Service {
    synchronized static public void printA(){
        for(int i=0; i<10; i++){
            System.out.println("A"+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void printB(){
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
