import java.util.*;

public class LeftArraysRotateByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        leftReverse(arr,0,k-1);
        leftReverse(arr,k,n-1);
        leftReverse(arr,0,n-1);
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }
      
  }
  public static void leftReverse(int[] arr, int start, int end){
    while(start<=end){
      int temp = arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
}