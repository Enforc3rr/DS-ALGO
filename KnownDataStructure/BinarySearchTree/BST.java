package BinarySearchTree;

public class BST {
    private Node root;
    public void insert(int key , String value){
        Node newNode = new Node(key,value);
        if(root==null){
            root = newNode;
        }else {
            Node current = root;
            Node parent ;
            while (true){
                parent = current;
                if(key<current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current==null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin(){
        Node current = root;
        Node last = null ;
        while (current!=null){
            last = current ;
            current = current.leftChild;
        }
        return last;
    }
    public Node findMax(){
        Node current = root;
        Node last = null ;
        while (current!=null){
            last = current ;
            current = current.rightChild;
        }
        return last;
    }
    public boolean remove(int key){
        Node current = root;
        Node parent =root;//necessary if root == nodeToDelete
        boolean isLeftChild = false;
        //to Find The Node
        while (current.key!=key){
            parent = current;
            if(current.key > key){
                current = current.leftChild;
                isLeftChild = true;
            }else {
                current = current.rightChild;
                isLeftChild = false;
            }
        }
        Node toDelete = current ;
        //leaf Node
        if(current.rightChild == null && current.leftChild == null){
            if(toDelete==root){
                root = null;
            }else if(isLeftChild){
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }
            //if Node To Delete Has One Child
        }
        else if(toDelete.rightChild==null){
            if(toDelete==root){
                root=toDelete.leftChild;
            }
            else if(isLeftChild) {
                parent.leftChild = toDelete.leftChild;
            }else {
                parent.rightChild = toDelete.leftChild;
            }
        }else if(toDelete.leftChild==null){
            if(toDelete==root){
                root=toDelete.rightChild;
            }
            else if(isLeftChild) {
                parent.leftChild = toDelete.rightChild;
            }else {
                parent.rightChild = toDelete.rightChild;
            }
        }
        //If Node To Delete Has Two Children
        else {
           Node successor = getSuccessor(toDelete);
           if(toDelete==root){
               root = successor;
           }else if(isLeftChild){
               parent.leftChild = successor;
           }else {
               parent.rightChild = successor;
           }
           successor.leftChild = toDelete.leftChild;
        }
        return true;
    }
    private Node getSuccessor(Node toDelete){
        Node sParent = toDelete;
        Node successor = toDelete;
        Node current = toDelete.rightChild;
        while (current!=null){
            sParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if(successor != toDelete.rightChild){
            sParent.leftChild = successor.rightChild;
            successor.rightChild = toDelete.rightChild;
        }
        return successor;
    }


}
