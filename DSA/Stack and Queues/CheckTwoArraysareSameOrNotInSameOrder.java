import java.util.*;

public class CheckTwoArraysareSameOrNot {
    public static void main(String[] args) {
      int arr1[] = {1,2,3,4,5};
      int arr2[] = {1,2,4,3,5};
      //Pointers comparison
      
      // int n = arr1.length;
      // boolean same = true;
      
      // if(arr1.length != arr2.length) same = false;
      
      // int i = 0, j = 0;
      
      // while(i<n && j<n){
      //   if(arr1[i]==arr2[j]){
      //     i++;
      //     j++;
      //   }
      //   else{
      //     same = false;
      //     break;
      //   } 
      // }
      
      // System.out.println(same);
      
      //Using Built in function
       if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are SAME");
        } else {
            System.out.println("Arrays are NOT same");
        }
  }
}