package cn.com.demo7;

public class Service {
    public void print1(){
       synchronized (this){
        for(int i=0; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }

      public void print2(){
          synchronized (this) {
              for (int i = 10; i < 20; i++) {
                  System.out.println(i);
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }

    }
}
