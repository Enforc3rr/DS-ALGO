package QuestionsDS;

class Node{
    public int data;
    public Node next;
}

public class MiddleOfLinkedList {
    private Node first;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }
    public int size(){
        int c = 0 ;
        Node current;
        current = first;
        while (current!=null){
            c++;
            current = current.next;
        }

        return c;
    }
    public int middleNumb(int size){
        int reqNumb = 0;
        int index = size/2;
        Node newNode;
        newNode = first;
        for(int i = 0 ; i < index ; i++){
            newNode = newNode.next;
        }
        reqNumb = newNode.data;
        return reqNumb;
    }

}
class TestClass3{
    public static void main(String[] args) {
        MiddleOfLinkedList newNode = new MiddleOfLinkedList();
        newNode.insertFirst(1);
        newNode.insertFirst(2);
        newNode.insertFirst(3);
        newNode.insertFirst(4);
        newNode.insertFirst(5);
        newNode.insertFirst(6);
        newNode.insertFirst(7);
        newNode.insertFirst(8);
        System.out.println(newNode.middleNumb(newNode.size()));
    }

}



