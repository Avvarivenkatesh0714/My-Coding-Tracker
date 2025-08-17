import java.util.*;

public class CountthenumberofsubarrayswithgivenxorK {
    public static void main(String[] args) {
      int[] a = {4, 2, 2, 6, 4};
      int k = 6;
      int n = a.length;
      int cnt = 0;
      
      for(int i=0;i<n;i++){
        int xorr=0;
        for(int j=i;j<n;j++){
           xorr=xorr^a[j];
           if(xorr==k) cnt++;
        }
      }
      System.out.println(cnt);
  }
}