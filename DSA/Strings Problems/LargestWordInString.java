import java.util.*;

public class LargestWordInString {
    public static void main(String[] args) {
      String s="take you forward";
      String[] str=s.split(" ");
      String ans="";
      for(String word:str){
        if(word.length()>ans.length()){
          ans=word;
        }
      }
      
      System.out.println(ans);
  }
}
//Output:

//forward