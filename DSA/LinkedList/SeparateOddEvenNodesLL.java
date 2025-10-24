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

public class SeparateOddEvenNodesLL {
  
   public static Node separateOddEvenNodesLL(Node head){
     
       Node odd = head;
       Node even = head.next;
       Node evenHead = even;
       
       while(even!=null && even.next!=null){
         odd.next = even.next;
         odd = odd.next;
         
         even.next = odd.next;
         even = even.next;
       }
       
       odd.next = evenHead;
       return head;
   }
   
    public static void printList(Node head){
      Node temp = head;
      
      while(temp != null){
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
      
      Node res = separateOddEvenNodesLL(head);
      printList(res);

  }
}