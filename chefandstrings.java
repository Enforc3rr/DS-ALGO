import java.util.Scanner;

public class chefandstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++)
        {
            int n = sc.nextInt();
            int s []  = new int[n];
            for(int j = 0 ; j < n ; j++)
            {
                s[j] = sc.nextInt();
            }
            long sum = 0 ;
            for(int j = 0 ; j < n-1 ; j++)
            {
                sum = sum + Math.abs(s[j]-s[j+1]) - 1 ;
            }
            System.out.println(sum);
        }
    }
}
