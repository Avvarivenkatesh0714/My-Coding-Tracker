class SplitArrayLargestSum {
    public int splitArray(int[] a, int k) {
         int low = Arrays.stream(a).max().getAsInt(); // largest element
        int high = Arrays.stream(a).sum(); // sum of all elements

        // Binary search for the smallest maxSum
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);

            if (partitions > k) {
                low = mid + 1; // too many partitions → increase maxSum
            } else {
                high = mid - 1; // valid but try smaller maxSum
            }
        }
        return low;
    }
     public int countPartitions(int[] a, int maxSum) {
        int partitions = 1; // at least one partition
        long subarraySum = 0; // sum of current subarray

        for (int num : a) {
            if (subarraySum + num <= maxSum) {
                subarraySum += num;
            } else {
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }
}