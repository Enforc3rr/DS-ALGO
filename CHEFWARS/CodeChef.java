package CHEFWARS;

import java.util.Scanner;

public class CodeChef {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = 0 ;
        if(sc.hasNextInt()){
            T = sc.nextInt();
        }
        for (int t = 0; t < T; t++) {
            int H = sc.nextInt();
            int P = sc.nextInt();
            int c = 0;
            while (H > 0) {
                H = H - P;
                P = P / 2;
                if (P < 1) {
                    c++;
                    break;
                }
            }
            if (c == 1) {
                System.out.println(0);
            } else
                System.out.println(1);
        }
        sc.close();
    }
}
