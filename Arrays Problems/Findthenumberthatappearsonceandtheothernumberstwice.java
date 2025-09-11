import java.util.*;

public class Findthenumberthatappearsonceandtheothernumberstwice {
    public static void main(String[] args) {
      int a[]= {1,1,2,3,3,4,4};
      HashMap<Integer,Integer> set = new HashMap<>();        
      int n = a.length;
      for(int i=0;i<n;i++){
       if(set.containsKey(a[i])){
          set.put(a[i],set.get(a[i])+1);
       }
       else{
         set.put(a[i],1);
       }
      }
      for(int i=0;i<n;i++){
        if(set.get(a[i])==1){
           System.out.println(a[i]);
        }
      }
  }
}


/*| Metric           | Complexity |
| ---------------- | ---------- |
| Time Complexity  | `O(n)`     |
| Space Complexity | `O(n)`     |
*/


/*Optimal Solution
int[] a = {1,1,2,3,3,4,4};
int result = 0;
for (int num : a) {
    result ^= num;
}
System.out.println(result);
This works because:

x ^ x = 0

x ^ 0 = x

✔️ New Time: O(n), Space: O(1) – highly efficient.
*/
