package PalindromeList;

public class Palindrome {
    private Node first;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        newNode.next=first;
        first = newNode;
    }
    public int size(){
        Node current = first ;
        int c = 0 ;
        while (current!=null){
            c++;
            current = current.next;
        }
        return  c;
    }

    public boolean palindrome(){
        int[] array = new int[size()];
        int[] arrayRev = new int[size()];
        Node current = first;
        for(int i = 0 ; i < size() ; i++){
            array[i]=current.data;
            current = current.next;
        }
        int count = size()-1;
        for(int i = 0 ; i < size() ; i++) {
            int temp = 0 ;
            temp = array[i];
            arrayRev[count] = temp;
            count--;
        }
        int c=0;
        for(int i = 0  ; i < size()  ; i++){
            if(array[i]!=arrayRev[i]){
                c++;
            }
        }

        return c != 0;
    }
}
class TestClass{
    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        pal.insertFirst(1);
        pal.insertFirst(2);
        pal.insertFirst(2);
        pal.insertFirst(1);

        if(!pal.palindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

}
