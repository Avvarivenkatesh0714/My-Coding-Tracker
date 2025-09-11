import java.util.*;

public class ReverseTheMiddlePartOfString{
    public static void main(String[] args) {
        String s = "Programming is fun";
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String a : str) {
            if (a.length() > 3) {
                char first = a.charAt(0);
                char last = a.charAt(a.length() - 1);
                String middle = a.substring(1, a.length() - 1);
                String reversedMiddle = new StringBuilder(middle).reverse().toString();
                ans.append(first).append(reversedMiddle).append(last);
            } else {
                ans.append(a);
            }
            ans.append(" ");
        }

        System.out.println(ans.toString().trim());
    }
}
