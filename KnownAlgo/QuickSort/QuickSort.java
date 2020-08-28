package QuickSort;

public class QuickSort {
    public int partition(int [] A , int p , int r){
        int x = A[r];
        int i = p-1;

            for(int j = p ; j <= r-1 ; j++){
                if(A[j]<=x){
                    i++;
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
         int ival = A[i+1];
            A[r]=ival;
            A[i+1]=x;

        return i+1;
    }

    public void quickSort(int [] A , int p , int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }
}
