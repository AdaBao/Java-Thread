package cn.com.demo18;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected  Object initialValue(){
        return new Date().getTime();
    }
}
