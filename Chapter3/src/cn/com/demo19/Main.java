package cn.com.demo19;

/*
* 子线程可以继承父线程的值,并做修改
* */
public class Main {
    static InheritableThreadLocalExt t=new InheritableThreadLocalExt();
    public static void main(String[] args){
        System.out.println(t.get());
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t.get());
            }
        });
        thread.start();
    }
}
