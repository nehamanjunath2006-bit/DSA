class MyStack{
int [] Stack = new int[5];
    int top =-1;
    public void push(int value){
        if(top == stack.length()-1){
            System.out.println("stack is overflow");
        }
        else{
            top = top + 1;
            stack[top] = value;
        }
    }
    public int pop(){
        if(stack.isEmpty){
            System.out.println("underflow");
        }
        value = stack[top];
        top = top - 1;
        return value;
    }
    public int peek(){
        if(top == -1){
            System.out.println("underflow")
        }
        return stack[top];

    }
}