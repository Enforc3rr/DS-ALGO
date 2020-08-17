

public class LinearSearching {
    public static void main(String[] args) {

    }
    public static int recursiveLinearSearching(int [] A , int x , int i){
        if(i > A.length){
            return -1;
        }else {
            if(A[i]==x){
                return i;
            }else {
                return recursiveLinearSearching(A,x,i+1);
            }
        }

    }
}
