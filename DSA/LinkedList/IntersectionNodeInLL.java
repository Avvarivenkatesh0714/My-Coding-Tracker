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

public class IntersectionNodeInLL {
  
  static Node insertNode(Node head,int val) {
    Node newNode = new Node(val);
    
    if(head == null) {
        head = newNode;
        return head;
    }
    
    Node temp = head;
    while(temp.next != null) temp = temp.next;
    
    temp.next = newNode;
    return head;
}
   //Brute Force Approach
    public static Node intersectionNodeInLL(Node head1, Node head2){
      
      HashSet<Node> mpp = new HashSet<>();
      
      while(head1 != null){
         mpp.add(head1);
         head1= head1.next;
      }
      
      while(head2 != null){
        if(mpp.contains(head2)) return head2;
        head2 = head2.next;
      }
      
      return null;
    }
    
    public static void main(String[] args) {
    Node head = null;
    head=insertNode(head,1);
    head=insertNode(head,3);
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,4);
    Node head1 = head;
    head = head.next.next.next;
    Node headSec = null;
    headSec=insertNode(headSec,3);
    Node head2 = headSec;
    headSec.next = head;
    
    Node res = intersectionNodeInLL(head1, head2);
    System.out.println(res.data);
  }
}