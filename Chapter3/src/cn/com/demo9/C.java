package cn.com.demo9;

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
