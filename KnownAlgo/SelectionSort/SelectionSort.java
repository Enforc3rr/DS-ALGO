package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] a = sort(new int[]{1,5,3,2,4});
        for(int i = 0  ; i < a.length ; i++)
            System.out.println(a[i]);

    }
    public static int [] sort(int[] a){
        for(int i = 0 ; i < a.length-1 ; i++){
            int min = i ;
            for(int j = i+1 ; j < a.length ; j++){
                if(a[j]<a[min]){
                    min = j ;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;

    }
}