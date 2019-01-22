package cn.com.demo7;

/*
*一生产与一消费:操作栈. 本示例是使生产者向堆栈List对象中放入数据,使消费者从List堆栈中取出数据
* List最大容量是1,实验环境只有一个生产者与一个消费者
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
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                c.get();
            }
        });


        threadB.start();
        threadA.start();
    }
}
