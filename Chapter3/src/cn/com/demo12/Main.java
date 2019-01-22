package cn.com.demo12;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/*
* 通过管道进行线程间通信:字符流
* */
public class Main {
    public static void main(String[] args){
        PipedReader reader=new PipedReader();
        PipedWriter writer=new PipedWriter();
        try {
            reader.connect(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();

        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                readData.readMethod(reader);
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                writeData.writeMethod(writer);
            }
        });

        threadA.start();
        threadB.start();
    }
}
