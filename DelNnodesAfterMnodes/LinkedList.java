package DelNnodesAfterMnodes;

public class LinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty(){
        return first==null;
    }
    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
        }else {
            newNode.previous = last;
            last.next = newNode;
        }
        last = newNode;
    }
    public void MNOperation(int m , int n){
        Node current = first ;
        LinkedList ll = new LinkedList();
        while (current!=null){
            for(int i = 0 ; i < m ; i++){
                ll.insert(current.data);
                current = current.next;
            }
            for(int i = 0 ; i < n ; i++){
                current = current.next;
            }
        }
       Node current1 = ll.first;
        while (current1!=null){
            System.out.print(current1.data + " ");
            current1=current1.next;
        }
    }
}
class TestClass{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(8);

        LinkedList linkedList1 = new LinkedList();

        linkedList.MNOperation(2,2);



    }
}
