import java.util.*; //Brute Force

public class longestSubArrayWithGivenSumK {
    public static void main(String[] args) {
      int[] a = {2, 3, 5, 1, 9};
      long k = 10;
      
      int len = longestSubArray(a,k);
      System.out.println(len);
  }
  public static int longestSubArray(int a[], long k){
   
             int n = a.length;
             int len = 0;
             for(int i=0;i<n;i++){
               for(int j=i;j<n;j++){
                 long s = 0;
                 for(int p=i;p<=j;p++){
                   s+=a[p];
                 }
                 if(s==k){
                   len = Math.max(len,j-i+1);
                 }
               }
             }
             return len;
   
  }
}
/*import java.util.*;

public class longestSubArrayWithGivenSumK {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;

        int len = longestSubArray(a, k);
        System.out.println(len);
    }

    public static int longestSubArray(int[] a, long k) {
        Map<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
*/

/*📦 Main Loop - Traverse the Array
java
Copy
Edit
for (int i = 0; i < a.length; i++) {
    sum += a[i];
Loop through each element in the array.

Add the current element to the cumulative sum.

🧮 Case 1: Subarray from index 0 to i has sum k
java
Copy
Edit
    if (sum == k) {
        maxLen = i + 1;
    }
If the entire subarray from index 0 to i has sum exactly equal to k, then the length is i + 1.

Update maxLen.

🧮 Case 2: Check if a subarray ending at i has sum k
java
Copy
Edit
    if (map.containsKey(sum - k)) {
        maxLen = Math.max(maxLen, i - map.get(sum - k));
    }
If we’ve seen sum - k earlier, then the subarray after that index up to the current index i must have sum k.

💡 Why?
If:

pgsql
Copy
Edit
prefixSum[i] = total sum from index 0 to i
and
prefixSum[j] = total sum from 0 to j (j < i)
Then,
prefixSum[i] - prefixSum[j] = sum of elements from j+1 to i
So, if sum - k exists in the map, update maxLen with the length of this subarray:
i - map.get(sum - k)

🧠 Store First Occurrence of Current Sum
java
Copy
Edit
    if (!map.containsKey(sum)) {
        map.put(sum, i);
    }
We store the first time we see a particular cumulative sum, because we want the longest subarray, and using the earliest index gives the maximum length.

🔚 Final Return
java
Copy
Edit
return maxLen;
After the loop, return the maximum length of the subarray found with sum = k.

🔄 Example Walkthrough
For:

java
Copy
Edit
int[] a = {2, 3, 5, 1, 9};
long k = 10;
Step-by-step sums:

i=0 → sum=2

i=1 → sum=5

i=2 → sum=10 → sum == k → maxLen = 3

i=3 → sum=11 → 11-10 = 1 not in map

i=4 → sum=20 → 20-10 = 10 in map at index 2 → subarray = [3,4], length = 2 → maxLen remains 3*/

/*| Approach        | Time Complexity | Space Complexity |
| --------------- | --------------- | ---------------- |
| Brute Force     | O(n³)           | O(1)             |
| Optimized (Map) | O(n)            | O(n)             |
*/