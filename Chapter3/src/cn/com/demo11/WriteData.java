package cn.com.demo11;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
    public void writeMethod(PipedOutputStream out){
        for(int i=0; i<100; i++) {
            try {
                out.write(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
