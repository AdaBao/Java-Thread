package cn.com.demo3;


/*
* 同步synchronized语句块得到相同实例的对象,但这种方法的运行效率也是非常低的
* */
public class Main {
    public static void main(String[] args){
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });

        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });

        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();

    }
}
