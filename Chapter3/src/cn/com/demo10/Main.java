package cn.com.demo10;

/*
* 多生产与多消费:操作栈. 本示例是使用生产者向栈List对象中放入数据,使用消费者从List
* 栈中取出数据. List最大容量是1,实验环境是多个生产者与多个消费者
* */
public class Main {
    public static void main(String[] args){
        MyStack myStack=new MyStack();
        P p1=new P(myStack);
        P p2=new P(myStack);
        P p3=new P(myStack);
        P p4=new P(myStack);

        C c1=new C(myStack);
        C c2=new C(myStack);
        C c3=new C(myStack);
        C c4=new C(myStack);

        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                p1.add();
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                p1.add();
            }
        });
        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                p1.add();
            }
        });
        Thread threadD=new Thread(new Runnable() {
            @Override
            public void run() {
                p1.add();
            }
        });

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                c1.get();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                c1.get();
            }
        });
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                c1.get();
            }
        });
        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                c1.get();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

    }
}
