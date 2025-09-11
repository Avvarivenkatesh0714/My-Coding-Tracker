class RemoveduplicatesfromSortedarray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // New length of array without duplicates
    }
}

/*✅ Time and Space Complexity:
⏱️ Time Complexity: O(n)
The loop runs from j = 1 to nums.length - 1, exactly once for each element.

All operations inside the loop are O(1).

✔ So, Time = O(n) where n is the number of elements in the array.

🧠 Space Complexity: O(1)
You're using only two integer pointers i and j, and modifying the array in-place.

No extra data structures are used.

✔ So, Space = O(1)*/
