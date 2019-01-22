package cn.com.demo7;

public class C {
    MyStack myStack;
    public C(MyStack myStack){
        this.myStack=myStack;
    }

    public void get(){
        while(true)
        {
            this.myStack.pop();
        }
    }
}
