//package QuestionsDS;
//
//class Node{
//    public Node next;
//    public int data;
//}
//class LinkedList{
//    private Node first;
//
//    public void insertFirst(int data){
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = first;
//        first = newNode;
//    }
//    public Node revList(){
//        Node current = first;
//        Node newNode = new Node();
//        while(current!=null)
//        {
//            newNode.data = current.data;
//            current = current.next;
//        }
//        return newNode;
//    }
//    public void displayList(Node node){
//        Node current = first;
//
//        while(current!=null)
//        {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//    }
//}
//public class RevLL {
//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(2);
//        linkedList.insertFirst(3);
//
//        linkedList.revList();
//        linkedList.displayList(linkedList.revList());
//
//
//    }
//}
