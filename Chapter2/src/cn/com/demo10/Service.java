package cn.com.demo10;

import java.util.ArrayList;
import java.util.List;

public class Service {
    List list=new ArrayList();

     public int getSize(){
        return list.size();
    }

     public void add(String str){
        list.add(str);
    }
}
