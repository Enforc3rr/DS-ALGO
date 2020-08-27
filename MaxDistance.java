import java.util.LinkedList;
import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ls = new LinkedList<>();
        int Q = sc.nextInt();
        int c = 0 ;
        for (int i = 0; i < Q; i++) {
            int n = sc.nextInt();
            if(n==1){
                int x = sc.nextInt();
                ls.add(x);
            }
            else if(n==2){
              int p = sc.nextInt();
                c++;
              ls.remove(p-c);
            }else {
                int x1 = ls.get(0);
                int x = sc.nextInt();
                int distance = Math.abs(x1 - x);
                System.out.println(distance);
            }
        }
    }
}
