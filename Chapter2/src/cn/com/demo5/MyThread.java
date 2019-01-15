package cn.com.demo5;

public class MyThread extends  Thread {
    SubClass sub;
    MyThread(SubClass sub){
        this.sub=sub;
    }
    @Override
    public void run(){
        sub.print();
    }
}
