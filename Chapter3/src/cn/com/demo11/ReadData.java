package cn.com.demo11;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void readMethod(PipedInputStream in){
        int x=-1;
        try {
            while ((x = in.read()) != -1) {
                System.out.print(x+" ");
            }
            in.close();
        }
        catch(IOException ex){

        }

    }
}
