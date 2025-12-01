import java.util.*;

public class CheckBothArraysAreSameButInDifferentOrder {
    public static void main(String[] args) { 
        int arr1[] = {3,2,5,7};
        int arr2[] = {2,0,5,7};
      
        boolean same = true;

        for(int i = 0; i < arr1.length; i++){
            boolean found = false;

            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]) {
                    found = true;   // match found
                    break;          // stop checking this element
                }
            }

            if(found == false) {            // if not found in arr2
                same = false;
                break;
            }
        }
      
        System.out.println(same);
    }
}
