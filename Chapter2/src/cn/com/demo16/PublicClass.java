package cn.com.demo16;

public class PublicClass {
    static int x=53;
    static int y=9;
    int z=2;

    public static  class PrivateClass{
        public void print(){
            System.out.println(x+y);
        }
    }

    public static void func(){}
}
