

public class BinarySearching {
    public static void main(String[] args) {

    }
    public static int recursiveBinarySearching(int [] A , int p , int r , int x){
       int q = (p+r)/2;
       if(p>r){
           return -1;
       }else {
           if (A[q]==x){
               return q;
           }else if(A[q]>x){
               return recursiveBinarySearching(A,p,q-1,x);
           }else
               return recursiveBinarySearching(A,q+1,r,x);
       }
    }
}
