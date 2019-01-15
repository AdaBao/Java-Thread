package cn.com.demo8;

public class Service {
    public void print(){
        String anyString=new String();
        synchronized (anyString){
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
