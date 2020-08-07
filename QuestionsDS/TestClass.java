package QuestionsDS;

import java.util.HashSet;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int T = 0 ; T < N ; T++)
        {
         int n = sc.nextInt();
         int x = sc.nextInt();
         HashSet<Integer> arr = new HashSet<Integer>();
         for(int i =  0 ; i < n ; i++)
         {
             int numb = sc.nextInt();
             arr.add(numb);
         }

         int x2 = count(arr);

         if(x2==x)
         {
             System.out.println("Good");
         }
         else if(x2<x)
         {
             System.out.println("BAD");
         }
         else
         {
             System.out.println("AVERAGE");
         }

        }
    }
    public  static int count(HashSet<Integer> hashSet)
    {
        return hashSet.size();
    }

}
