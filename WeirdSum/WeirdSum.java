package WeirdSum;

import java.util.Scanner;

public class WeirdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        if(N%2==0){
            for(int i = 0 ; i <= N - N/2 ; i++){
                int temp = arr[i];
                for(int k = i+1 ; k < i + N/2 ; k++){
                    temp = temp * arr[k];
                }
                c = c + temp;
            }
        } else  {
            for(int i = 0 ; i < N - ((N/2) - 1) ; i++){
                int temp = arr[i];
                for(int k = i+1 ; k < i + ((N/2) - 1) ; k++){
                    temp = temp * arr[k];
                }
                c = c + temp;
            }
        }
        System.out.println(c);
    }
}

