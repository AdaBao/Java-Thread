package cn.com.demo22;

/*
* 使用原子类来进行同步，可以看到最后的输出结果是正确的，但是中间值并不是预期的，因为原子类不能保证方法和
* 方法之间的调用也是原子的
* */
public class Main {
    public static void main(String[] args){
        Service service=new Service();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        Thread thread5=new Thread(new Runnable() {
            @Override
            public void run() {
                service.method1();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
