import java.util.*;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
      String s = "(()())(())";
      int n = s.length();
      String str = removeParanthesis(s, n);
      System.out.println(str);
  }
  public static String removeParanthesis(String s, int n){
      StringBuilder res = new StringBuilder();
      int lev = 0;
      for(char ch : s.toCharArray()){
        if(ch=='('){
          if(lev>0) res.append(ch);
          lev++;
        }
        else if(ch==')'){
          lev--;
          if(lev>0) res.append(ch);
        }
      }
      
      return res.toString();
  }
}