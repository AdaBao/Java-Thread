package cn.com.demo9;


/*
* 获得根线程组
* */
public class Main {
    public static void main(String[] args){
        ThreadGroup group=new ThreadGroup("A");
        System.out.println(group.getParent().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
