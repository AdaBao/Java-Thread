package cn.com.demo6;

import java.io.Serializable;

public class MyObject implements Serializable {
    private MyObject(){}

    //静态内部类可以有静态成员,普通内部类不能有静态成员
    private static class MyObjectHandler{
        private  static MyObject myObject=new MyObject();
    }
      public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
    public MyObject readResolve(){
        return MyObjectHandler.myObject;
    }
}
