package Queue;

public class Queue {
    private int [] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[this.maxSize];
        this.front = 0 ;
        this.rear = -1;
        this.nItems = 0 ;
    }
    public void insert(int data){
        rear++;
        queueArray[rear] = data;
        nItems++;
    }
    public int remove(){
        int temp = queueArray[front];
        front++;
        nItems--;
        return temp;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public boolean isFull(){
        return nItems==maxSize;
    }

}
