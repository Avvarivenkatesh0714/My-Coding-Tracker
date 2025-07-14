import java.util.*;

public class CapitalizetheFirstAndLastLetterOfWord {
    public static void main(String[] args) {
      String s="take you forward";
      String[] str=s.split(" ");
      StringBuilder ans=new StringBuilder();
      for(String word:str){
        if(word.length()==1){ //length of a word is 1 the captialize the word
          ans.append(Character.toUpperCase(word.charAt(0)));
        }
        else{
          ans.append(Character.toUpperCase(word.charAt(0)))  //first letter of word is captialize
          .append(word.substring(1,word.length()-1))  //middle part should assistise attach
          .append(Character.toUpperCase(word.charAt(word.length()-1))); //last letter of word is captialize
        }
        ans.append(" ");
      }
  
      System.out.println(ans.toString());
  }
}