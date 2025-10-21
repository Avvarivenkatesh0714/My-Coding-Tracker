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

public class FindMiddleNodeOfLL {
  
  // Brute Force
  
    // public static Node middleNodeOfLL(Node head){
    //   int cnt = 0;
    //   Node temp = head;
      
    //   while(temp!=null){
    //     cnt++;
    //     temp=temp.next;
    //   }
      
    //   int midNode = (cnt/2)+1;
    //   temp = head;
      
    //   while(temp!=null){
    //     midNode = midNode-1;
        
    //     if(midNode==0) break;
        
    //     temp=temp.next;
    //   }
    //   return temp;
    // } 
  
  //Optimal Approach
    public static Node middleNodeOfLL(Node head){
         Node slow = head;
         Node fast = head;
         
         while(fast.next != null && fast != null){
           slow = slow.next;
           fast = fast.next.next;
         }
         return slow;
    }
    
    public static void main(String[] args) {
      
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);
      
      Node res = middleNodeOfLL(head);
      
      System.out.println(res.data);
  }
}