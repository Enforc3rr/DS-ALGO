package QuickSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int [] A = {1,5,4,2,3,6};
        qs.quickSort(A,0,A.length-1);
        System.out.println(Arrays.toString(A));
    }
}
