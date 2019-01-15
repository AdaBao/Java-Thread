package cn.com.demo3;

/*
* 当存在父子类继承关系时，子类是完全可以
* 通过“可重入锁”调用父类的同步方法
* */
public class Main {
    public static void main(String[] args){
        SubClass sub=new SubClass();
        sub.print();
    }
}
