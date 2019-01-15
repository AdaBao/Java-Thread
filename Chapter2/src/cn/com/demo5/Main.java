package cn.com.demo5;

/*
* 同步不具有继承性，也就是说子类中重写的方法不能继承父类方法的synchronized的作用
* 所以还需要在子类的方法中再次添加synchronized
* */
public class Main {
    public static void main(String[] args){
        SubClass sub=new SubClass();
        MyThread thread1=new MyThread(sub);
        MyThread thread2=new MyThread(sub);

        thread1.start();
        thread2.start();
    }
}
