import java.util.*;

public class PalindromeOfNumber {
    public static void main(String[] args) {
      int n= 1221;
      if(paliNum(n)==true){
      System.out.println("Pali");
      }
      else{
        System.out.println("Not");
      }
  }      
   static boolean paliNum(int n){
    int rev=0;int temp=n;
    while(n>0){
        int dig=n%10;
        rev=rev*10+dig;
        n=n/10;
    }
    return (temp==rev);
  }
  
   }
