import java.util.*;

public class FindPeakElementInArray {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,5,1};
      int res = function(arr);
      System.out.println(res);
  }
  //Optimal
  static int function(int nums[]){
     // Set left and right bounds
        int low = 0, high = nums.length - 1;

        // Binary search loop
        while (low < high) {
            // Find mid point
            int mid = (low + high) / 2;

            // If mid element is greater than next
            if (nums[mid] > nums[mid + 1]) {
                // Move to left half
                high = mid;
            } else {
                // Move to right half
                low = mid + 1;
            }
        }

        // Return peak index
        return low;
  }
  // static int function(int arr[]){
  //   int n = arr.length;
    
  //   for(int i=0;i<n;i++){
  //     if((i==0 || arr[i-1]<arr[i]) && (i==n-1 || arr[i]>arr[i+1]))
  //             // return i; //Prints peak element index
  //             return arr[i]; // prints peak element number
  //   }
  //   return -1;
  // }
}