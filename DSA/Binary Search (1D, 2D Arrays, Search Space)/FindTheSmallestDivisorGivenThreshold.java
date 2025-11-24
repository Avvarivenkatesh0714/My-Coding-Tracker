import java.util.*;
//Optimal Binary Search Approach
public class FindTheSmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int threshold = 8;
        int res = smallestDivisor(a, threshold);
        System.out.println(res);
    }

    static int smallestDivisor(int a[], int threshold){
        int low = 1;
        int high = Arrays.stream(a).max().getAsInt();
        int ans = -1;
        while(low<=high){
          int mid = (low+high)/2;
          if(sum(mid,a) <= threshold){
            ans = mid;
            high = mid -1;
          }
          else{
            low = mid + 1;
          }
        }
        return ans;
    }

    static int sum(int x, int a[]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += (a[i] + x - 1) / x; // correct ceiling
        }
        return sum;
    }
}

//Brute Force Traversal
// public class FindTheSmallestDivisorGivenThreshold {
//     public static void main(String[] args) {
//         int a[] = {8,4,2,3};
//         int threshold = 10;
//         int res = smallestDivisor(a, threshold);
//         System.out.println(res);
//     }
       
//     static int smallestDivisor(int a[], int threshold){
//         int max = Arrays.stream(a).max().getAsInt();
//         for(int i = 1; i <= max; i++){
//             if(sum(i, a) <= threshold) return i;
//         }
//         return -1;
//     }

//     static int sum(int x, int a[]){
//         int sum = 0;
//         for(int i = 0; i < a.length; i++){
//             sum += (a[i] + x - 1) / x; // correct ceiling
//         }
//         return sum;
//     }
// }
