import java.util.*;

public class NumnerIsPalindrome {
    public static void main(String[] args) {
      int num=1221;
      int rev=0;
      int temp=num;
      while(num>0){
        int dig=num%10;
        rev=rev*10+dig;
        num=num/10;
      }
      if(temp==rev){
      System.out.println("Palindrome");
      }
      else{
        System.out.println("not");
      }
  }
}