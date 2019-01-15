package cn.com.demo3;

public class SubClass extends  ParentClass{
    synchronized public void print(){
        super.print();
        System.out.println("sub");
    }
}
