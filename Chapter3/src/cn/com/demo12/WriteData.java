package cn.com.demo12;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {
    public void writeMethod(PipedWriter writer){
        try {
        for(char c='A'; c<='Z'; c=(char)(c+1)) {
            writer.write(c);
        }
        writer.flush();
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
