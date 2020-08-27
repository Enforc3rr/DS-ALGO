package Heap;

public class Heap {
    private Node [] heapArray;
    private int maxSize;
    private int currentSize;
    public void Heap(int size){
        heapArray = new Node[size];
        this.maxSize = size;
        currentSize = 0 ;
    }
    public int getSize(){
        return currentSize;
    }
    public boolean isEmpty(){
        return (currentSize==0);
    }
    public boolean insert(int key){
        if(currentSize==maxSize){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(key);
        currentSize++;
        return true;
    }
    public void trickleUp(int index){
        int parentIndex =  (index-1)/2;
        Node nodeToInsert = heapArray[index];
        while (index > 0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()){
            heapArray[index]=heapArray[parentIndex];
            index = parentIndex;
            parentIndex = (parentIndex-1)/2;
        }
        heapArray[index]=nodeToInsert;
    }
    public Node remove(){
        Node root = heapArray[0];
        currentSize--;
        heapArray[0]= heapArray[currentSize];
        trickleDown(0);
        return root;
    }
    private void trickleDown(int index){
        int largerChildIndex = 0;
        Node top = heapArray[index];
        while (index < currentSize/2){
            int leftChildIndex = 2*index + 1 ;
            int rightChildIndex = 2*index + 2 ;

            if(rightChildIndex < currentSize && heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()){
                largerChildIndex = rightChildIndex ;
            }else {
                largerChildIndex = leftChildIndex;
            }
            if(top.getKey() >= heapArray[largerChildIndex].getKey()){
                break;
            }
            heapArray[index] = heapArray[largerChildIndex];
            index = largerChildIndex;
        }
        heapArray[index] = top;
    }


}
