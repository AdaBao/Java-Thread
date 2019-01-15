package cn.com.demo10;

public class ThreadB extends Thread{
    Service service;

    public ThreadB(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        synchronized (service){
            if(this.service.getSize()<1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.service.add("b");
            }
        }

    }
}
