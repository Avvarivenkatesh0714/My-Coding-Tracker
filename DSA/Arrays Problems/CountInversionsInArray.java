import java.util.*;

public class CountInversionsInArray{
    public static void main(String[] args) {
      int a[] = {1,2,3,4,5};
      int n = a.length;
      
      int cnt = 0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]>a[j]){
            cnt++;
          }
        }
      }
      System.out.println(cnt);
  }
}