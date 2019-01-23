package cn.com.demo6;


import java.io.*;

/*
* 要注意序列化会破坏单例模式
* */
public class Main {
    public static void main(String[] args){
        try {
            MyObject myObject=MyObject.getInstance();
            FileOutputStream fileOutputStream=new FileOutputStream("temp.det");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            System.out.println(myObject.hashCode());

            FileInputStream fileInputStream=new FileInputStream("temp.det");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            MyObject myObject1=(MyObject)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(myObject1.hashCode());
            System.out.println(myObject1.readResolve().hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
