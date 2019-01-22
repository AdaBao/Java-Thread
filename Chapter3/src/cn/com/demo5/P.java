package cn.com.demo5;

public class P {
    private ValueObject lock;
    public P(ValueObject lock){
        this.lock=lock;
    }

    public void setValue(){
        synchronized (lock){

            if(!lock.value.equals("")) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.value="P "+System.currentTimeMillis();
            System.out.println(lock.value);
            lock.notify();
        }
    }
}
