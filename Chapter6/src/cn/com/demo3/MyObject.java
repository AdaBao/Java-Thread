package cn.com.demo3;

public class MyObject {
    private static MyObject myObject;
    private MyObject(){}

      public static MyObject getInstance(){
          synchronized(MyObject.class) {
              if (myObject == null) {
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  myObject = new MyObject();
                  return myObject;
              } else
                  return myObject;
          }
    }
}
