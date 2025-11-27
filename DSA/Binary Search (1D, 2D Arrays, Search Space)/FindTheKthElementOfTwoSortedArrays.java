import java.util.*;

public class FindTheKthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int a1[] = {2, 3, 6, 7, 9};
        int a2[] = {1, 4, 8, 10};

        int n1 = a1.length;
        int n2 = a2.length;
        int i = 0, j = 0, k = 0;

        int nthele = 4;   // find the 4th smallest element

        int a3[] = new int[n1 + n2];

        // Merge both sorted arrays
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) a3[k++] = a1[i++];
            else a3[k++] = a2[j++];
        }

        while (i < n1) a3[k++] = a1[i++];
        while (j < n2) a3[k++] = a2[j++];

        // Find Nth element
        for (int m = 1; m <= a3.length; m++) {
            if (m == nthele) {
                System.out.println("The element is: " + a3[m - 1]);
                break;
            }
        }
    }
}
