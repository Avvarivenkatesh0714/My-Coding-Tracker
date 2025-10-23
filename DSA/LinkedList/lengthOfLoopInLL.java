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

public class lengthOfLoopInLL {
  
  // //Brute Force Approach
  //   public static int lengthOfLoop(Node head){
  //     Node temp = head;
  //     int timer = 0;
       
  //     Map<Node, Integer> map = new HashMap<>();
       
  //     while(temp != null){
  //       if(map.containsKey(temp)){
  //         int value = map.get(temp);
  //         return timer-value;
  //       }
         
  //       map.put(temp, timer);
  //       temp = temp.next;
  //       timer++;
         
  //     }
  //     return 0;
  //   }
  
  // Optimal Approach
    public static int lengthOfLoop(Node head){
         Node slow = head;
         Node fast = head;
         int cnt = 0;
         while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
              return countLength(slow);
           }
         }
         return 0;
    }
    
    public static int countLength(Node meetingPoint){
         Node temp =  meetingPoint;
         int length = 1;
         
         while(temp.next != meetingPoint){
           temp = temp.next;
           length++;
         }
         return length;
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
        int res = lengthOfLoop(head);
      System.out.println(res);
  }
}