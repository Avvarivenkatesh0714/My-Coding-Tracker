import java.util.*;

public class NumToEngConvertion {
    public static void main(String[] args) {
        int a = 123;
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder ans = new StringBuilder();
        String numStr = String.valueOf(a);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            ans.append(arr[digit]).append(" ");
        }

        System.out.println(ans.toString().trim());
    }
}
//Output:

//One Two Three