package cn.com.demo6;

public class Service {
    public void print(){
        synchronized (this){
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}
