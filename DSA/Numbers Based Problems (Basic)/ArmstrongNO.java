import java.util.*;

public class ArmstrongNO {
    public static void main(String[] args) {
      int num=153;
      double sum=0; 
      int k=String.valueOf(num).length(); //integer number cannot get length value irrespective like arrays and strings so num coverted into string and gets length of num
      int dup=num;
      while(num>0){
        int dig=num%10; //gets last digit from num=153 i.e; 3 ans dig=3
        sum=sum+Math.pow(dig,k); // sum=0+3^3
        num=num/10; // gets num=15 and delete the last digit 3 then send to while(15>0)
      }
      if(sum==dup){
      System.out.println("Armstrong number");
      }
      else{
        System.out.println("Not");
      }
      System.out.println(sum);
  }
 
}