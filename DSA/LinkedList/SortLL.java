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

public class SortLL {
    //Brute Force
    public static Node sortLL(Node head){
        
        ArrayList<Integer> arr = new ArrayList<>();

        // Pointer to traverse the list
        Node temp = head;

        // Traverse and push values into list
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        // Sort the list
        Collections.sort(arr);

        // Reassign sorted values to list nodes
        temp = head;
        for (int i = 0; i < arr.size(); i++) {
            temp.data = arr.get(i);
            temp = temp.next;
        }

        // Return head of sorted list
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
      Node head = new Node(2);
      head.next = new Node(3);
      head.next.next = new Node(1);
      head.next.next.next = new Node(5);
      head.next.next.next.next = new Node(4);
      
      Node res = sortLL(head); 
      printNodes(res);
  }
}