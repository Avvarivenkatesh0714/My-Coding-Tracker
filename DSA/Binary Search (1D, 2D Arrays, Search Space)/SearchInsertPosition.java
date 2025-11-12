import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
      
      int a[] = {1,2,4,7};
      int n = a.length;
      int x = 9;
      int res = searchInsertPosition(a,n,x);
      
      System.out.println(res);
  }
  
  //Brute Force Solution
  // public static int searchInsertPosition(int a[], int n, int x){
  //   int ans = n;
  //   for(int i = 0;i<n;i++){
  //     if(a[i]>=x){
  //       return i;
  //     }
  //   }
  //   return ans;
  // }
  //Optimal Solution
  /*
    <--------------- Implement Lower Bound Code ----------------->
  */
}