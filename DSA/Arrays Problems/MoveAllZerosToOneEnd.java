import java.util.*;

public class MoveAllZerosToOneEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans= moveZerosToEnd(arr, n);
        for(int i=0;i<n;i++){
          System.out.print(ans[i]+" ");
        }
      
  }
  public static int[] moveZerosToEnd(int[] arr, int n){
    List<Integer> list = new ArrayList<>();
    
    for(int i:arr){
      if(i!=0){
        list.add(i);
      }
    }
    
    int k = list.size(); //7
    
    for(int i =0;i<k;i++){
      arr[i]=list.get(i);
    }
    
    for(int i=k;i<n;i++){
      arr[i]=0;
    }
    return arr;
    
  }
}