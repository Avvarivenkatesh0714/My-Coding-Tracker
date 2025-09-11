import java.util.*;

public class removeAllCharacters {
    public static void main(String[] args) {
        String s = "Hello,world!@";
        String a = s.toLowerCase();
        StringBuilder str = new StringBuilder();

        int n = a.length();

        for (int i = 0; i < n; i++) {
            char ch = a.charAt(i);

            
            if (!(ch >= 'a' && ch <= 'z')) {
                str.append(ch);
            }
        }

        System.out.println(str.toString()); 
    }
}
