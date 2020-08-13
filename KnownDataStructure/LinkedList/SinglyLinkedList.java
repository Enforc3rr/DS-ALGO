package LinkedList;

public class SinglyLinkedList {
    private Node first ;
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int deleteFirst(){
        int temp = first.data;
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
        while(current.next!=null){
            current=current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
