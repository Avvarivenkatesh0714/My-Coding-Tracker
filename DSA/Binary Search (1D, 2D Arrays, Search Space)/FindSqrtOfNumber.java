import java.util.*;

public class FindSqrtOfNumber {
    public static void main(String[] args) {
      int n = 42;
      //Brute Force
      // int ans = 1;
      // for(int i=1;i<=n;i++){
      //   if(i*i <= n) ans = i;
      //   else break;
      // }
      int ans = function(n);
      System.out.println(ans);
  }
  //Optimal
  static int function(int n){
      int low = 1;
      int high = n;
      int ans = 1;
      
      while(low<=high){
           int mid = (low+high)/2;
           if(mid*mid <= n){
             ans = mid;
             low = mid+1;
           }
           else{
             high = mid - 1;
           }
      }
      return ans;
  }
}