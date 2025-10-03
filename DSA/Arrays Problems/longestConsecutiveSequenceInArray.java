
//Optimal Approach
import java.util.HashSet;

class longestConsecutiveSequenceInArray {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            // Only start counting if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

//Brute Force

/*class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int cnt = 1;

            // Check for next consecutive elements
            while (linearSearch(nums, x + 1)) {
                x = x + 1;
                cnt += 1;
            }

            // Update max count if needed
            if (cnt > maxCount) {
                maxCount = cnt;
            }
        }

        return maxCount;
    }

    public boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
*/