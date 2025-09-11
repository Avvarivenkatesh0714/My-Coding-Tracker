import java.util.*;

public class SecLargestElementInArray {
    public static void main(String[] args) {
       	int[] arr = {1, 2, 4, 6, 7, 5};
       	
       	int n = arr.length;
       	
       	/*int large = arr[0];
       	
       	for(int i=0;i<n;i++){
       	  if(arr[i]>large){
       	    large =arr[i];
       	  }
       	}

       //large =7;
       int secLarge = Integer.MIN_VALUE;
       
       for(int i=0;i<n;i++){
         if(arr[i]>secLarge && arr[i]!=large)
              secLarge=arr[i];
       }*/
       
       int large=Integer.MIN_VALUE;
       
       int secLarge=Integer.MIN_VALUE;
       
       for(int i=0;i<n;i++){
         if(arr[i]>large){
           secLarge=large;
           large=arr[i];
         }
         else if(arr[i]>secLarge && arr[i]!=large){
           secLarge=arr[i];
         }
       }
       
       
        System.out.println(secLarge); 
    }
}
