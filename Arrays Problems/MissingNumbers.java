import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
      
        int[] a = {1, 2, 4, 5};
        int n = 5;
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != i + 1) {
                System.out.println(i + 1);
                found = true;
                break;
            }
        }

        if (!found) {
            // If no mismatch found, then the missing number is n
            System.out.println(n);
        }
    }
}
