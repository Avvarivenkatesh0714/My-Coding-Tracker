import java.util.*;

public class ImplementUpperBound {
    public static void main(String[] args) {
      
      int a[] = {1,2,3,3,5,8,8,10,10,11};
      int n = a.length;
      int x = 9;
      int res = implementUpperBound(a,n,x);
      
      System.out.println(res);
  }
  
  //Brute Force Solution
  public static int implementUpperBound(int a[], int n, int x){
    int ans = n;
    for(int i = 0;i<n;i++)
      if(a[i]>x) return i;
    return ans;
  }
  //Optimal Solution
  // public static int implementUpperBound(int a[],int n,int x){
  //   int ans = n;
  //   int low = 0; 
  //   int high = n-1;
    
  //   while(low<=high){
  //     int mid = (low+high)/2;
  //     if(a[mid]>x){
  //       ans = mid;
  //       high = mid-1;
  //     }
  //     else{
  //       low = mid +1;
  //     }
  //   }
  //   return ans;
  // }
}