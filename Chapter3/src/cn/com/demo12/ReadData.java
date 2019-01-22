package cn.com.demo12;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
    public void readMethod(PipedReader reader){
        int c=-1;
        try {
            while ((c = reader.read()) != -1) {
                System.out.print((char)c+" ");
            }
            reader.close();
        }catch (IOException ex){

        }
    }
}
