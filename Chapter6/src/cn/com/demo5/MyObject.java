package cn.com.demo5;

public class MyObject {
    private MyObject(){}

    //静态内部类可以有静态成员,普通内部类不能有静态成员
    private static class MyObjectHandler{
        private  static MyObject myObject=new MyObject();
    }
      public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
