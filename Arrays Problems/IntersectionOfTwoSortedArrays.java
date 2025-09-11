import java.util.*;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
      
        int[] a = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] b = {2, 3, 3, 5, 6, 6, 7};
        
        List<Integer> intersection = new ArrayList<>();
        
        int i = 0, j = 0;
        int m = a.length, n = b.length;
        
        while (i < m && j < n) {
            if (a[i] == b[j]) {
                intersection.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        System.out.println(intersection); // Output: [2, 3, 3, 5, 6]
    }
}
