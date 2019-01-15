package cn.com.demo4;

public class Service {
    String value="abc";
    synchronized  public void setValue(){

        int x=5/0;
        this.value="edf";
    }

    synchronized  public void getValue(){
        System.out.println(this.value);
    }
}
