package cn.com.demo9;

import java.util.ArrayList;
import java.util.List;

public class Service {
    List list=new ArrayList();

    synchronized public int getSize(){
        return list.size();
    }

    synchronized public void add(String str){
        list.add(str);
    }
}
