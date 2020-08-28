package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = sort(new int[]{1,5,3,2,4});
        for(int i = 0  ; i < a.length ; i++)
            System.out.println(a[i]);

    }
    public static int [] sort(int [] A){
        for(int i = 1 ; i < A.length-1 ; i++){
            int element = A[i];
            int j = i - 1;
            while (j>=0&&A[j]>element){
                A[j + 1] = A[j];
                j--;
            }
            A[j+1]=element;
        }
        return A;
    }
}
