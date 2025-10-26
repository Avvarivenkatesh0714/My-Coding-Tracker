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

public class Sort0s1sAnd2s {
   //Optimal Approach
    public static void print(Node head){
       Node temp = head;
       while(temp != null){
         System.out.print(temp.data+" ");
         temp = temp.next;
       }
       System.out.print("");
    }
    
    public static Node sort0s1sAnd2s(Node head){
         if (head == null || head.next == null) return head;

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        // Separate lists for 0s, 1s, and 2s
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        // Combine the three lists
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        // Set new head
        Node newHead = (zeroHead.next != null) ? zeroHead.next
                        : (oneHead.next != null ? oneHead.next : twoHead.next);

        return newHead;
       
    }
    
    // Brute Force Approach
    // public static Node sort0s1sAnd2s(Node head){
    //     Node temp = head;
    //     int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        
    //     while(temp != null){
    //         if(temp.data == 0) cnt0++;
    //         else if(temp.data == 1) cnt1++;
    //         else cnt2++;
            
    //         temp = temp.next;
    //     }
        
    //     temp = head;
        
    //     while(temp != null){
    //       if(cnt0>0){
    //         temp.data = 0;
    //         cnt0--;
    //       }
    //       else if(cnt1>0){
    //         temp.data = 1;
    //         cnt1--;
    //       }
    //       else{
    //         temp.data = 2;
    //         cnt2--;
    //       }
    //       temp = temp.next;
    //     }
        
    //     return head;
    // }
    
    public static void main(String[] args) {
      Node head = new Node(1);
      head.next = new Node(0);
      head.next.next = new Node(2);
      head.next.next.next = new Node(1);
      head.next.next.next.next = new Node(0);
      
      Node res = sort0s1sAnd2s(head);
      
      print(res);
  }
}