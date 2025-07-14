import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
      int num=5;
      int cnt=0;
      for(int i=1;i<=num;i++){
         if(num%i==0){
           cnt++;
         }
      }
      if(cnt==2){
        System.out.println("Prime no");
      }
      else{
        System.out.println("Not");
      }
     
  }
 
}