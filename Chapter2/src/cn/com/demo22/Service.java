package cn.com.demo22;

import java.util.concurrent.atomic.AtomicInteger;

public class Service {
    volatile AtomicInteger x=new AtomicInteger(0);

    public void method1(){
        for(int i=0; i<10000; i++)
        {
            x.incrementAndGet();
        }
        System.out.println(x);

    }
}
