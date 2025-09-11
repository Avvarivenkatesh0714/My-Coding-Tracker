import java.util.*;

public class ArrrayIsSorted {
    public static void main(String[] args) {
       	   int arr[] = {1, 3, 2, 4, 5}, n = 5;
       	   
       	   Boolean sort = true;
       	   
       	   for(int i=0;i<n-1;i++){
       	     if(arr[i]>arr[i+1]){
       	       sort = false;
       	       break;
       	     }
       	   }
       	   
       	   if(sort==true){
       	      System.out.println("Sort"); 
       	   }
       	   else{
       	      System.out.println("NOT"); 
       	   }
       
       
       
    }
}
