package cn.com.demo1;

public class PublicVar {
    String username="u1";
    String password="p1";

    synchronized  public void setValue(String username,String password){
        this.username=username;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password=password;
    }

    //如果去掉synchronized关键字，读出来的是脏数，因为setValue方法和getValue方法没有同步
    //就是说两个方法出现了交叉
    synchronized  public void getValue(){
        System.out.println("username: "+this.username);
        System.out.println("password: "+this.password);
    }
}
