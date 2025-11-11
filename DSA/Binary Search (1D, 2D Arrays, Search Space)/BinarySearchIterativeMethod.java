import java.util.*;

public class BinarySearchIterativeMethod {

    public static void main(String[] args) {
      
      int arr[] = {1,2,3,4,5,6,7,8};
      
      int n = arr.length;
      
      int target = 7;
      
      int res = binarySearchIterativeMethod(arr,n,target);
      
      System.out.println(res);
    
   }
   
   public static int binarySearchIterativeMethod(int arr[], int n, int target){
      int low = 0;
      int high = n-1;
      
      while(low<=high){
        int mid = (low+high)/2;
        
        if(target==arr[mid]) return mid;
        else if(target<arr[mid]) high = mid - 1;
        else low = mid + 1;
      }
      return -1;
   }
}