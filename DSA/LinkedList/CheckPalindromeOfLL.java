import java.util.*;

class Node{
  int data;
  Node next;
  
  Node(int data1, Node next1){
    this.data=data1;
    this.next=next1;
  }
  
  Node(int data1){
    this.data=data1;
    this.next=null;
  }
}

public class CheckPalindromeOfLL {
  //Brute Force Approach
    public static boolean palindromeOfLL(Node head){
         Node temp = head;
         Stack<Integer> stack = new Stack<>();
         
         while(temp!=null){
           stack.push(temp.data);
           temp=temp.next;
         }
         
         temp = head;
         
         while(temp!=null){
           if(temp.data!=stack.pop()){
             return false;
           }
           temp=temp.next;
         }
         
         return true;
    }
    
    public static void main(String[] args) {
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(1);
      head.next.next.next.next = new Node(5);
      
      boolean res = palindromeOfLL(head);
      System.out.println(res);
  }
}