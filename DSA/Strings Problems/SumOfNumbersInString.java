import java.util.*;

public class SumOfNumbersInString {
    public static void main(String[] args) {
      String s="123Hello";
      int sum=0;
      for(int i=0;i<s.length()-1;i++){
        char ch=s.charAt(i);
        if(ch>='0' && ch<='9'){
          int num=ch-'0'; //char to int converstion
          sum+=num;// after conversion addition to prev sum
        }
      }
      System.out.println(sum);
  }
}