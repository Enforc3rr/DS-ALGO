package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int x = 3 ;
        int answer =-1 ;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]==x){
                answer = i ;
                break;
            }
        }
        System.out.println(answer);
    }
}
