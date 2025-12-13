import java.util.*;

public class ExaAGOAQuestion {
    public static void main(String[] args) {
      int a[] = {1,3,5,2,4};
      int b[] = {1,4,2,9};
      int c[] = {1,2,3,4};
      
      List<Integer> res = find(a,b,c);
      
      for(int i=0;i<res.size();i++){
        System.out.println(res.get(i));
      }
      
  }
    public static List<Integer> find(int a[],int b[],int c[]){
      List<Integer> ans = new ArrayList<>();
      
      for(int i=0;i<a.length;i++){
        int sum = 0;
        for(int j=0;j<b.length;j++){
          if(a[i]>=b[j]){
            sum+=c[j];
          }
        }
        ans.add(sum);
      }
      return ans;
    }
}