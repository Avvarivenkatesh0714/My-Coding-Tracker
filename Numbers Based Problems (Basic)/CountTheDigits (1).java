import java.util.*;

public class CountTheDigits {
    public static void main(String[] args) {
      int n= 9498983;
      int count= countDig(n);
      System.out.println(count);
  }
   static int countDig(int n){
 
     int cn=0;
     while(n>0){
      
       n=n/10;
       cn++;
     }
     return cn;
   }
}