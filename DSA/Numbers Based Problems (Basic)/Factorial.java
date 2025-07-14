import java.util.*;

public class Factorial {
    public static void main(String[] args) {
      int n= 5;
      int res=fact(n);
      System.out.println(res);
      
  }      
   static int fact(int n){
    if(n==0) return 1;
    int pro=1;
    for(int i=2;i<=n;i++){  /* return n*fact(n-1);
                                    */
      pro=pro*i;
    }
    return pro;
  }
  
   }
