import java.util.*;

public class PerfectNo {
    public static void main(String[] args) {
      int num=28;
      int sum=0;
      int dup=num;
      for(int i=1;i<=num-1;i++){
        if(num%i==0){
          sum=sum+i;
        }
      }
      if(dup==sum){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
  }
 
}