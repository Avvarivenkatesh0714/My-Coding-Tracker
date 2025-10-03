import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
      String s="Hello";
      StringBuilder ans=new StringBuilder();
      for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        ans.append(ch);
      }
      System.out.println(ans.toString());
  }
}