package cn.com.demo17;

public class OuterClass {
    public static class inner{
        public void method1(){
            synchronized ("其他的锁"){
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
