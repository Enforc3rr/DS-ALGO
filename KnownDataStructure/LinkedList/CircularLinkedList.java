package LinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int deleteFirst(){
        int temp = first.data;
        if(first.next==null){
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList(){
        Node current = first;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void insertLast(int data){
        Node current = first;
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        } else {
            last.next = newNode;
            newNode = last;
        }
    }

}
