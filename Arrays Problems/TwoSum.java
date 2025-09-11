//Better (Hashing)(Unsorted Array)
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[] {}; // No solution found
    }
}

/*Time Complexity: O(n)

One pass through the array, constant time map operations.

Space Complexity: O(n)

Storing up to n elements in the HashMap.*/

//Brute force

/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {}; // No solution found
    }
}
*/

/*Time Complexity: O(n²)

Nested loop over n elements.

Space Complexity: O(1)

No extra data structures used.*/

/*Two-Pointer Approach (Sorted Array Only)

while (l < r) {
    int sum = nums[l] + nums[r];
    if (sum == target) return new int[] {l, r};
    else if (sum < target) l++;
    else r--;
}*/

/*Time Complexity: O(n)

One pass from both ends.

Space Complexity: O(1)

No extra space used.*/