import java.util.Scanner;

public class CodeVitaPali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s = "";
        int c = 0 ;
        for(int n=n1;n<=n2; n++) {
  			for(int h1=0;h1<=2;h1++){
    			for(int h2=0;h2<=3;h2++) {	
        			for(int m1=0;m1<=5;m1++) {
            			for(int m2=0;m2<=9;m2++) {
                			for(int s1=0;s1<=5;s1++) {
                    			for(int s2=0;s2<=9;s2++) {
                        s = "" + n + h1 + h2 + m1 + m2 + s1 + s2;
                        c = c + paliCheck(s);
                    }
                }
            }
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
