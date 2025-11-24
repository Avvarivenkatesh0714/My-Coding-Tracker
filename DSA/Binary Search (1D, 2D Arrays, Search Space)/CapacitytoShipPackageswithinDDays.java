import java.util.*;

//Optimal Solution
public class CapacitytoShipPackageswithinDDays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int res = mainFunction(a, days);
        System.out.println(res);
    }

    static int mainFunction(int a[], int days) {

        int left = Arrays.stream(a).max().getAsInt(); // minimum capacity
        int right = Arrays.stream(a).sum();           // maximum capacity
        int ans = right;

        while (left <= right) {

            int mid = (left + right) / 2;

            int neededDays = findDays(mid, a);

            if (neededDays <= days) {
                ans = mid;        // possible answer
                right = mid - 1;  // try smaller capacity
            } else {
                left = mid + 1;   // increase capacity
            }
        }

        return ans;
    }

    static int findDays(int cap, int a[]) {
        int day = 1;
        int load = 0;

        for (int i = 0; i < a.length; i++) {   // FIXED
            if (load + a[i] > cap) {
                day++;
                load = a[i];
            } else {
                load += a[i];
            }
        }

        return day;
    }
}
