package cn.com.demo17;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected  Object initialValue(){
        return new Date().getTime();
    }
}
