import java.util.*;

public class TrailingZerosOfFactorial {
    public static void main(String[] args) {
      int n= 10;
      int res=fact(n);
      System.out.println(res);
      
  }      
   static int fact(int n){
    if(n==0) return 1;
    int pro=1;
    for(int i=2;i<=n;i++){  /* return n*fact(n-1);          */
      pro=pro*i;
    }
    int rev=0;
    int cnt=0;
    while(pro>0){
      int dig=pro%10;
      if(dig==0) cnt++;
      pro=pro/10;
    }
    return cnt;
  }
  
   }
