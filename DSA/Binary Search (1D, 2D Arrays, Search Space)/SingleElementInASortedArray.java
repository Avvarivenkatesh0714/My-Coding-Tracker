import java.util.*;

public class SingleElementInASortedArray { 
    public static void main(String[] args) { 
      int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
      int ans = element(arr);
      System.out.println(ans);
  } 
  //Optimal
  static int element(int arr[]){
    int n = arr.length;
    if(n==1) return arr[0];
    if(arr[0]!=arr[1]) return arr[0];
    if(arr[n-1]!=arr[n-2]) return arr[n-1];
    
    int low = 1;
    int high = n-2;
    
    while(low<=high){
      int mid = (low+high)/2;
      
      if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
      
      if((mid%2==1 && arr[mid-1]==arr[mid])||(mid%2==0 && arr[mid+1]==arr[mid])){
        low = mid + 1;
      }
      else{
        high = mid - 1;
      }
    }
    return -1;
  }
  //Brute Force
  // static int element(int arr[]){
  //   int n = arr.length;
  //   //if array contains only one element
  //   if(n==1) return arr[0];
    
  //   for(int i=0;i<n;i++){
  //     //checking first element in array
  //     if(i==0){
  //       if(arr[i]!=arr[i+1]) return arr[i];
  //     }
  //     //checking last element in array
  //     else if(i==n-1){
  //       if(arr[i]!=arr[n-1]) return arr[i];
  //     } 
  //     //checking in between all elements in array
  //     else{
  //       if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]) return arr[i];
  //     }
  //   }
  //   return -1;
  // }
}