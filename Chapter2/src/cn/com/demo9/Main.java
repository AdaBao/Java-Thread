package cn.com.demo9;

/*
* 这个例子出现了脏读的情况，可以查看demo10中的修正版
* 因为出现了交叉执行，比如: ThreadA: getSize-> ThreadB: getSize->ThreadA: add->ThreadB: add
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA threadA=new ThreadA(service);
        ThreadB threadB=new ThreadB(service);

        threadA.start();
        threadB.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.getSize());
    }
}
