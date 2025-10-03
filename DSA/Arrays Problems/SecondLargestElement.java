import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
      
        int[] a =  {1, 2, 4, 7, 7, 5};
        
        int slarge=Integer.MIN_VALUE;
        int large=Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++){
          if(a[i]>large){
            slarge=large;
            large=a[i];
          }
          else if(a[i]>slarge && a[i]!=large){
            slarge=a[i];
          }
        }
        
        System.out.println(slarge);
     
       
    }
}
