
//Optimal (Kadenes Algo)

class MaxSubArray {
    public int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;

        for(int i=0; i<n; i++ )
        {
                sum+=arr[i];

                if(sum>max){
                    max = sum;
                }

                if(sum<0){
                    sum=0;
                }
        }
        return max;
    }
}

/*
ime Complexity: O(N), where N = size of the array.
Reason: We are using a single loop running N times.

Space Complexity: O(1) as we are not using any extra space.*/