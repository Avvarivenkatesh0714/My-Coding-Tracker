import java.util.*;

public class BalancedNumberCheck {
    public static void main(String[] args) {
      String s = "1234006";
      char[] str = s.toCharArray();
      // Brute Force
      
      // int mid = (0+str.length-1)/2;
      // int target = str[mid];
      // int leftSum = 0;
      // int rightSum = 0;
      // for(int i=0;i<mid;i++){
      //   leftSum+=str[i];
      // }
      // for(int j=mid+1;j<str.length;j++){
      //   rightSum+=str[j];
      // }
      // if(leftSum==rightSum){
      //   System.out.println("Hello, World!");
      // }
      // else{
      //   System.out.println("Good Bye, World!");
      // }
      
      // Optimal Solution
      
      int low = 0;
      int high = str.length-1;
      int leftSum=0;
      int rightSum=0;
        while (low < high) {
            leftSum += str[low];
            rightSum += str[high];
            low++;
            high--;
        }

        if (leftSum == rightSum) 
            System.out.println("Hello, World!");
        else 
            System.out.println("Good Bye, World!");
      
  }
}