package cn.com.demo8;

/*
*一生产与多消费:操作栈. 本示例是使生产者向堆栈List对象中放入数据,使消费者从List堆栈中取出数据
* List最大容量是1,实验环境有一个生产者与多个消费者
* */
public class Main {
    public static void main(String[] args){
        MyStack myStack=new MyStack();
        P p=new P(myStack);
        C c=new C(myStack);

        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                p.add();
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                c.get();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                c.get();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                c.get();
            }
        });
        threadA.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
