package cn.com.demo5;

public class SubClass  extends ParentClass{
    @Override
    public void print(){
        for(int i=0; i<1000; i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }

    }
}
