package cn.com.demo1;

public class ThreadA extends  Thread {
    PublicVar publicVar;

    ThreadA(PublicVar publicVar){
        this.publicVar=publicVar;
    }
    @Override
    public void run(){
        this.publicVar.setValue("u2","p2");
    }
}
