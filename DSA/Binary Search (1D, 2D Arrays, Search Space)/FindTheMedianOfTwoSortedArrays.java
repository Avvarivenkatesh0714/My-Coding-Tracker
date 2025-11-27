import java.util.*;

//Brute Force 
public class FindTheMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int a1[] = {1, 3, 4, 7, 10, 12};
        int a2[] = {2, 3, 6, 15};
        int n1 = a1.length;
        int n2 = a2.length;
        int i = 0, j = 0, k = 0;

        int a3[] = new int[n1 + n2];

        // Merge both sorted arrays
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) a3[k++] = a1[i++];
            else a3[k++] = a2[j++];
        }

        while (i < n1) a3[k++] = a1[i++];
        while (j < n2) a3[k++] = a2[j++];

        int n = n1 + n2;

        // Find and print the median
        if (n % 2 != 0)
            System.out.println("Median: " + a3[n / 2]);
        else
            System.out.println("Median: " + (a3[n / 2 - 1] + a3[n / 2]) / 2.0);
    }
}
