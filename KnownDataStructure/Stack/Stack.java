package Stack;
public class Stack {
    private int top;
    private int maxSize;
    private int [] stackArray;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[this.maxSize];
        this.top = -1;
    }
    public void push(int data){
        top++;
        stackArray[top] = data;
    }
    public int pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return maxSize==top-1;
    }

}
