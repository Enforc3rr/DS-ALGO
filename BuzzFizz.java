public class buzzfizz{
  public static void main (String[] args){
     int count3 = 0;
     int count5 = 0;
    for(int i = 1 ; i<=20 ;i++){
      count3++;
      count5++;
      String data ="";
      if(count3==3){
        data = data+ "Buzz";
        count3=0;
      }
      if(count5==5){
        data= data + "Fizz";
        count5=0;
      }
      if(data.equals("")){
        System.out.println(i);
      }else{
        System.out.println(data);
      }
    }
    }
  }
