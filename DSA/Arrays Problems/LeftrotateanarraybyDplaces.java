//optimal solution (leetcode)
class LeftrotateanarraybyDplaces {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle k > n

        // Reverse the whole array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*⏱️ Time Complexity: O(n)
Let’s analyze the steps:

reverse(nums, 0, n - 1) → O(n)

reverse(nums, 0, k - 1) → O(k)

reverse(nums, k, n - 1) → O(n - k)

Total = O(n + k + (n - k)) = O(2n) = O(n)

✅ So, Time Complexity = O(n)

🧠 Space Complexity: O(1)
You are modifying the nums[] array in-place.

You only use a few variables: start, end, temp.

✅ So, Space Complexity = O(1)

*/



//Brute Force

/*public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    int[] result = new int[n];

    // Copy last k elements
    for (int i = n - k; i < n; i++) {
        result[index++] = nums[i];
    }

    // Copy first n - k elements
    for (int i = 0; i < n - k; i++) {
        result[index++] = nums[i];
    }

    // Copy result[] back to nums[]
    for (int i = 0; i < n; i++) {
        nums[i] = result[i];
    }
}
*/

/*⏱️ Time Complexity: O(n)
Let’s break it down:

First loop (copy last k elements): O(k)

Second loop (copy first n - k elements): O(n - k)

Third loop (copy back to nums): O(n)

👉 Total = O(k + (n - k) + n) = O(3n) = O(n)

🧠 Space Complexity: O(n)
You used an extra array result[] of size n.

No other large data structures used.

👉 So space = O(n)*/