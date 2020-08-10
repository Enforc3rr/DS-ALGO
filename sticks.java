import java.util.Scanner;

public class sticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++)
        {
            int sum = 0 ;
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l ; j <=r ; j++)
            {
                if(spl(j))
                {
                    sum = sum + j ;
                }
                else {
                    int k = j;
                    while (!spl(k)) {
                        k++;
                        if (spl(k)) {
                            sum = sum + k;
                        }
                    }
                }
            }
            System.out.println(sum);
        }

    }
    static boolean spl(int n)
    {
        int c = 0 ;
        int c1=0;
        int n1 = n ;
        while(n>0)
        {
            int d = n%10;
            if(d==2 || d==5)
            {
                c++;
            }
            n = n/10;
        }
        while(n1>0)
        {
            c1++;
            n1=n1/10;
        }
        if(c1==c)
            return  true;
        else
            return false;

    }
}
