import java.util.*;

public class LastOccurenceInSortedArray {
    public static void main(String[] args) {
      int a[] = {3,4,13,13,13,20,40};
      int target = 13;
      
      int res = lastOccurenceInSortedArray(a,target);
      
      System.out.println(res);
  }
  
   static int lastOccurenceInSortedArray(int a[], int target){
     int low = 0;
        int high = a.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                res = mid;
                low = mid + 1;  // keep searching right part for last occurrence
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
   }
  // static int lastOccurenceInSortedArray(int a[], int target){
  //   int cnt = -1;
  //   for(int i=0;i<a.length;i++){
  //       if(a[i]==target) cnt = i;
  //     }
  //     return cnt;
  // }
}