package cn.com.demo17;

/*
* ThreadLocal的initialValue方法应该是只能被调用一次
* */
public class Main {
    static ThreadLocalExt t=new ThreadLocalExt();
    public static void main(String[] args){
        for(int i=0; i<Integer.MAX_VALUE; i++){
            System.out.println(t.get());
        }
    }
}
