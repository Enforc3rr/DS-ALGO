import java.util.Scanner;

public class CodeVitaPali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s = "";
        int c = 0 ;
        for(int n = n1 ; n <= n2 ;  n++){
            for(int hh = 0 ; hh < 24 ; hh++){
                for(int mm = 0 ; mm < 60 ; mm++){
                    for(int sec = 0 ; sec < 60 ;sec++){
                        s = s + n + hh + mm + sec;
                        c = c + paliCheck(s);
                    }
                }
            }
        }
        System.out.println(c);
    }
    public static int paliCheck(String s){
        String copy = "";
        for(int i = s.length()-1 ; i >= 0 ; i--){
            copy = copy + s.charAt(i);
        }
        int check = 0;
        if(copy.equals(s))
        check = 1;
        else
        check = 0;

        return check;
    }
}
