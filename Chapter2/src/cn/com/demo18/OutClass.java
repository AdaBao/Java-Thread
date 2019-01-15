package cn.com.demo18;

public class OutClass {
    public static class InnerClass1{
        public void method1(InnerClass2 class2){
            synchronized (class2){
                for(int i=0; i<10; i++){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static class InnerClass2{
        synchronized public void method2(){
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
