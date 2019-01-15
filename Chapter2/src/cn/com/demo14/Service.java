package cn.com.demo14;

public class Service {
    String str;

    public Service(String str){
        this.str=str;
    }

    public void printA(){
        synchronized (str){
            for(int i=0; i<10; i++){
                System.out.println("A "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printB(){
        synchronized (str){
            for(int i=0; i<10; i++){
                System.out.println("B "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
