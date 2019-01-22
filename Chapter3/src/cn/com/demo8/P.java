package cn.com.demo8;

public class P {
    MyStack myStack;
    public P(MyStack myStack){
        this.myStack=myStack;
    }
    public void add(){
        while(true){
            myStack.push();
        }

    }
}
