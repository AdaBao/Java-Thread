package cn.com.demo2;

public class MyObject {
    private static MyObject myObject;
    private MyObject(){}

    synchronized  public static MyObject getInstance(){
        if(myObject==null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject=new MyObject();
            return myObject;
        }else
            return myObject;
    }
}
