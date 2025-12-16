import java.util.*;

public class FibonociiOfEvenSum{
    public static void main(String[] args) {
      int n = 5;
      int res = find(n);
      System.out.println(res);
  }
  public static int find(int n){
    int fib[] = new int[n+1];
    fib[0] = 0;
    fib[1] = 1;
    
    for(int i=2;i<=n;i++){
      fib[i] = fib[i-1]+fib[i-2];
    }
    
    int sum = sumCheck(fib);
    return sum;
  }
  public static int sumCheck(int fib[]){
    int s =0;
    
    for(int x : fib){
      if(x%2==0) s+=x;
    }
    return s;
  }
}