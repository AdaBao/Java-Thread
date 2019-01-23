package cn.com.demo16;

/*
* 线程组内处理异常
* */
public class Main {
    public static void main(String[] args){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                String str=null;
                System.out.println(str.hashCode());
            }
        });
        MyGroup myGroup=new MyGroup("A");
        Thread thread_=new Thread(myGroup,thread);
        thread_.start();
    }
}
