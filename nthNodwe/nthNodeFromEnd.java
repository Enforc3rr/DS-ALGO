package nthNodwe;

class Node{
    public  int data;
    public Node next;
}

public class nthNodeFromEnd {
    private  Node first;
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next= first;
        first = newNode;
    }
    public int nthNode(int nNode){
        Node current = first ;
        for(int i = 0; i < nNode; i++){
            current = current.next;
        }
        return current.data;
    }
}
class TestClass{
    public static void main(String[] args) {
        nthNodeFromEnd end = new nthNodeFromEnd();
        end.insertFirst(1);
        end.insertFirst(2);
        end.insertFirst(3);
        end.insertFirst(4);
        end.insertFirst(5);
        end.insertFirst(6);
        System.out.println(end.nthNode(2));
    }
}
