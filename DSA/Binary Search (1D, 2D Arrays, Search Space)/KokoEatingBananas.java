//Version 1 (Striver)
class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
         int low = 1;
         int high = maxOfPiles(piles);
         int ans = maxOfPiles(piles);
         while(low<=high){
            int mid = (low+high)/2;
            int totalHours = func(piles,mid);
            if(totalHours<=h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
         }
         return ans;
    }
    public int func(int piles[], int speed){
        int hrs = 0;
        for(int bananas : piles){
           hrs+=(int)Math.ceil((double)bananas / speed);
        }
        return hrs;
    }
    public int maxOfPiles(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}

//version 2(Clean and improved one)

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxOfPiles(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = computeHours(piles, mid);
            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // returns total hours as long to avoid overflow
    private long computeHours(int[] piles, int speed) {
        long hours = 0L;
        for (int bananas : piles) {
            // cast to long before addition to avoid overflow
            hours += ((long) bananas + speed - 1) / speed;
            // early exit if already larger than any reasonable h
            if (hours > Integer.MAX_VALUE) return hours; 
        }
        return hours;
    }

    private int maxOfPiles(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }
}
