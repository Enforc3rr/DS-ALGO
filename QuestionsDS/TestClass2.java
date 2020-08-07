package QuestionsDS;

import java.util.LinkedList;
import java.util.Scanner;

public class TestClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            String s = sc.next();
            LinkedList<Character> c = new LinkedList<>();
            for(int j = 0 ; j < s.length() ; j++)
            {
                c.add(j,s.charAt(j));
            }
            for(int k = 0 ; k < c.size() ; k++) {

                for (int j = 0; j < c.size() - 1; j++) {
                    if (c.get(j) == c.get(j + 1)) {
                        c.remove(j);
                    }

                }
            }
            String str = "";
            for(int j = 0 ; j<c.size();j++)
            {
                str = str + c.get(j);
            }
            System.out.println(str);

        }
    }
}
