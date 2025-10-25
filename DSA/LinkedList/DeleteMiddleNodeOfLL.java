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

public class DeleteMiddleNodeOfLL {
  
  // //Brute Force Approach
  //   public static Node deleteMiddleNodeOfLL(Node head){
  //     Node temp = head;
  //     int n = 0;
  //     while(temp!=null){
  //       n++;
  //       temp = temp.next;
  //     }
       
  //     int cnt = n/2;
  //     temp = head;
  //     int timer = 1;
  //     while(temp!=null && temp.next!=null){
  //         if(timer == cnt){
  //           temp.next = temp.next.next;
  //         }
  //         temp = temp.next;
  //         timer++;
  //     }
  //     return head;
  //   }
    
    public static Node deleteMiddleNodeOfLL(Node head){
        if(head == null || head.next == null) return head;
        
        Node slow = head;
        
        Node fast = head.next.next;
        
        while(fast !=null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
    
    public static void printNodes(Node head){
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
      }
      System.out.print("");
    }
    public static void main(String[] args) {
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);
      
      Node res = deleteMiddleNodeOfLL(head); 
      printNodes(res);
  }
}