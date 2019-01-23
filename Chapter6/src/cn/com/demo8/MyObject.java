package cn.com.demo8;

public enum MyObject {
    object1;
    private String str;
    private  MyObject(){
        this.str="abc";
    }
    public  String getList(){
        return this.str;
    }
}
