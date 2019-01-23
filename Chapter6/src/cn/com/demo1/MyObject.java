package cn.com.demo1;

public class MyObject {
    private static MyObject myObject;
    private MyObject(){}

    public static MyObject getInstance(){
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
