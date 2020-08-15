package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

    }
    public static int binarySearch(int x , int [] array){
        int p = 0 ;
        int r = array.length -1;
        while (p<=r){
            int q = (p+r)/2;
            if(array[q]>x){
                r = q -1 ;
            }else if(array[q]<x) {
                p = q + 1;
            }else {
                return q;
            }
        }
//        while (p<=r){
//            int q = (p+r)/2;
//            if(array[q]==x){
//                return q;
//            } else if(array[q]<x){
//                p = q+1;
//            }else {
//                r = q -1 ;
//            }
//        }
        return -1;
    }
}
