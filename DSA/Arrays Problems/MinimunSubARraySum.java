
//Optimal (Kadenes Algo)
import java.util.*;

public class MinimunSubARraySum {
    public static long minSubarraySum(int[] arr, int n) {
        long minSum = Long.MAX_VALUE;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (currentSum < minSum) {
                minSum = currentSum; // update minSum
            }

            if (currentSum > 0) {
                currentSum = 0; // reset if current sum goes above 0
            }
        }

        return minSum;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        long minSum = minSubarraySum(arr, n);
        System.out.println("The minimum subarray sum is: " + minSum);
    }
}
/*
 Time complexity: O(N)
 Space complexity: O(1)
*/