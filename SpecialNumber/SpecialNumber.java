package SpecialNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int j = 1; j <= T; j++) {
            long L = Long.parseLong(br.readLine());
            long R = Long.parseLong(br.readLine());
            long K = Long.parseLong(br.readLine());
            long cond = 0;
            for (long i = L; i <= R; i++) {
                long c = 0;
                long temp = i ;
                while (temp>0){
                    long d = temp % 10 ;
                    if (d % K == 0) {
                        c++;
                    }
                    temp = temp/10;
                }
                if (c == countdigit(i)) {
                    cond++;
                }
            }
            System.out.println(cond);
        }
    }
    public static int countdigit(long n){
        int c =0 ;
        while(n>0){
            long d = n % 10 ;
            c++;
            n = n/10;
        }
        return c;
    }
}
