// Better (Hashing)
import java.util.*;

public class MajorityElementInArray {
    public static void main(String[] args) {
       int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
  }
  
  public static int  majorityElement(int arr[]){
    int n = arr.length;
    
    Map<Integer,Integer> map = new HashMap<>();
     
    int cnt =0;
    
    for(int i=0;i<n;i++){
      if(!map.containsKey(arr[i])){
           map.put(arr[i],1);  
      }
      else{
        map.put(arr[i],map.get(arr[i])+1);
      }
    }
    
    
     for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if(it.getValue() > n/2){
               return it.getKey();
            }
     }
    
    return -1;
    
  }
}

/*Time complexity: O(N*logN)+O(N)
   Space complexity: O(N)
*/