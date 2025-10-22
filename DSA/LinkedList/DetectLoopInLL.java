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

public class DetectLoopInLL {
    
    // //Brute Force Approach
    // public static boolean detectLoopInLL(Node head){
              
    //           Node temp = head;
              
    //           Map<Node, Integer> map = new HashMap<>();
              
    //           while(temp != null){
                 
    //             if(map.containsKey(temp)){
    //               return true;
    //             }
                 
    //             map.put(temp,1);
    //             temp = temp.next;
    //           }
    //           return false;
    // }
    
    //optimal Approach
    public static boolean detectLoopInLL(Node head){
      
      Node slow = head;
      Node fast = head;
      
      while(fast.next != null && fast !=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
          return true;
        }
      }
      return false;
      
    }
    
    public static void main(String[] args) {
      
       Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
      
      boolean res = detectLoopInLL(head);
      
      System.out.println(res);
  }
}