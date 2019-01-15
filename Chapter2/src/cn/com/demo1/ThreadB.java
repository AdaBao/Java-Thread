package cn.com.demo1;

public class ThreadB extends  Thread {
    PublicVar publicVar;

    ThreadB(PublicVar publicVar){
        this.publicVar=publicVar;
    }
    @Override
    public void run(){
        this.publicVar.getValue();
    }

}
