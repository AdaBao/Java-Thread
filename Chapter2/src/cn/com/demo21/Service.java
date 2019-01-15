package cn.com.demo21;

public class Service {
    volatile int x=0;

    public void method1(){
        for(int i=0; i<10000; i++)
        {
            x++;
        }
        System.out.println(x);

    }

}
