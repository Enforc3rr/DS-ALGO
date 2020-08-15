package DoublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
    }
    public Node deleteFirst(){
        Node temp = first;
        if(first.next==null){
            last = null;
        } else {
            first.next.previous=null;
        }
        first = first.next;
        return temp;
    }
    public Node deleteLast(){
        Node temp = last;
        if(first.next==null){
            last = null;
        } else {
            last.previous.next=null;
        }
        last = last.previous;
        return temp;
    }
     public Node deleteAfter(int key){
        Node current = first;
        if(current.data != key){
            current = current.next;
            if(current==null){
                return null;
            }
        }
        Node temp = current;
        if(current==last){
            last = current.previous;
            current.previous = null;
            last.next = null;
        }else {
            current.next.next.previous = current;
            current.next = current.next.next;
        }
        return  temp;
    }
    public Node deleteKey(int key){
        Node current = first;
        Node temp = current;
        if(current.data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if(current==first){
                first = first.next;
            }else {
                current.next.previous = current.previous;
            }
            if(current==last){
                last = current.previous;
            }else {
                current.previous.next=current.next;
            }
            return temp;
    }

}
