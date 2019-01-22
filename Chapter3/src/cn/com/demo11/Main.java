package cn.com.demo11;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
* 使用管道进行线程间的通信:字节流
* */
public class Main {
    public static void main(String[] args){
        PipedInputStream in=new PipedInputStream();
        PipedOutputStream out=new PipedOutputStream();

        try {
            in.connect(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                readData.readMethod(in);
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                writeData.writeMethod(out);
            }
        });

        threadA.start();
        threadB.start();
    }
}
