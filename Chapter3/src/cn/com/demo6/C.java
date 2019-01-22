package cn.com.demo6;

public class C {
    private ValueObject lock;
    public C(ValueObject lock){
        this.lock=lock;
    }

    public void getValue(){
        synchronized (lock){
            if(lock.value.equals("")) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName()+" C");
            lock.value="";
            lock.notifyAll();
        }
    }
}
