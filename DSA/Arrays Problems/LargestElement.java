import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
      
        int[] a = {2,5,1,3,0};
        
        int max=a[0];
        
        for(int i=0;i<a.length;i++){
          if(a[i]>max){
            max=a[i];
          }
        }
        System.out.println(max);
       
    }
}
