import java.util.*;

public class AllPalindromesInGivenRange {
    public static void main(String[] args) {
      int min=10;
      int max=50;
      for(int i=min;i<=max;i++){
        if(isPali(i)==true){
          System.out.println(i+" ");
        }
      }
     
  }
  static boolean isPali(int num){
      int rev=0;
      int temp=num;
      while(num>0){
        int dig=num%10;
        rev=rev*10+dig;
        num=num/10;
      }
      if(temp==rev){
      return true;
      }
      else{
        return false;
      } 
  }
}